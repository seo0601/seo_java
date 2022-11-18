package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.FriendDao;
import test.dao.MemberDao;
import test.dto.FriendDto;
import test.dto.MemberDto;

public class FriendFrame extends JFrame 
					implements ActionListener, PropertyChangeListener{
	JTextField inputName, inputNum, inputPhone, inputBirth;
	JTable table;
	DefaultTableModel model;
	public FriendFrame() {
		setLayout(new BorderLayout());
		//JLabel
	
		JLabel label1 = new JLabel("이름");
		inputName = new JTextField(10);		
		JLabel label2 = new JLabel("전화번호");
		inputPhone = new JTextField(10);		
		JLabel label3 = new JLabel("생일");
		inputBirth = new JTextField(10);
		//JButton
		JButton saveBtn = new JButton("입력");
		saveBtn.setActionCommand("save");
		JButton delBtn = new JButton("삭제");
		delBtn.setActionCommand("delete");

		
		//UI 배치
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputPhone);
		panel.add(label3);
		panel.add(inputBirth);
		panel.add(saveBtn);
		panel.add(delBtn);
		add(panel, BorderLayout.NORTH);
		
		//표형식으로 정보 출력하는 JTable
		table = new JTable();
		String[] colNames = {"번호", "이름", "전화번호", "생일"};
		model=new DefaultTableModel(colNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				if(column == 0) {
					return false;
				}else {
					return true;
				}				
			}
		};	
		//버튼에 리스너 등록
		saveBtn.addActionListener(this);
		delBtn.addActionListener(this);
		
		table.setModel(model);
		JScrollPane scroll = new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		displayFriend();
		table.addPropertyChangeListener(this);
	}
	//테이블에 친구 정보를 출력하는 메소드
	public void displayFriend() {
		model.setRowCount(0);
		List<FriendDto> list = new FriendDao().getList();
		for(FriendDto tmp : list) {
			Object[] row = {tmp.getNum(), tmp.getName(), phone_format(tmp.getPhone()), tmp.getBirth()};
			model.addRow(row);
			
		}
	}
	
	
	public static void main(String[] args) {
		FriendFrame f=new FriendFrame();
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setBounds(100, 100, 800, 500);
	      f.setVisible(true);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();	
		if(command.equals("save")) {
			//입력한 정보 얻어오기
			String name = inputName.getText();
			String phone = inputPhone.getText();
			String birth = inputBirth.getText();
			FriendDto dto = new FriendDto();
			dto.setName(name);
			dto.setPhone(phone);
			dto.setBirth(birth);
			boolean isSuccess = new FriendDao().insert(dto);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, name +"의 정보를 추가했습니다.");
				displayFriend();
			}else {
				JOptionPane.showMessageDialog(this, "정보 추가 실패");
			}			
		}else if(command.equals("delete")) {
			int rowIndex = table.getSelectedRow();
			if(rowIndex == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row를 선택하세요");
				return;
			}
			int num =(int)model.getValueAt(rowIndex, 0);
            new FriendDao().delete(num);
            displayFriend();
		}	
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals("tableCellEditor") && !table.isEditing()) {
			int rowIndex = table.getSelectedRow();
			int num = (int)table.getValueAt(rowIndex, 0);
			String name = (String)table.getValueAt(rowIndex, 1);
			String phone = (String)table.getValueAt(rowIndex, 2);
			String birth = (String)table.getValueAt(rowIndex, 3);
			FriendDto dto = new FriendDto();
			FriendDao dao = new FriendDao();
			dto.setNum(num);
			dto.setName(name);
			dto.setPhone(phone);
			dto.setBirth(birth);
			dao.update(dto);
			table.clearSelection();			
		}
	 
	}
	public String phone_format(String number) {
		String regEx = "(\\d{3})(\\d{3,4})(\\d{4})";
		return number.replaceAll(regEx, "$1-$2-$3");
	}
	
/*	public Date date_format(String date) {
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String datestr = format.format(Calendar.getInstance().getTime());
		datestr = format.format(new java.util.Date());
		return date.replaceAll(date, datestr)*/
				
	
	
}
