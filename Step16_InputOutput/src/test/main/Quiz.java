package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * 1.JTextField에 문자열을 입력하고 추가 버튼을 누르면
 *   입력한 문자열이 myFolder/memo.txt 파일에 append 되도록 해보세요
 *   
 *  2. 불러오기 버튼을 누르면 myFolder/memo.txt 파일에 있는 모든 문자열을
 *     JTextArea에 출력하도록 해보세요. 
 */
public class Quiz extends JFrame implements ActionListener {
	
	JTextField inputMsg;
	JTextArea loadMsg;
	
	public Quiz(String title) {
		super(title);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		inputMsg = new JTextField(10);
		loadMsg = new JTextArea();
		JButton addBtn = new JButton("추가");
		JButton loadBtn = new JButton("불러오기");
		
		add(addBtn);
		add(loadBtn);
		add(inputMsg);
		add(loadMsg);
		
		addBtn.addActionListener(this);
		loadBtn.addActionListener(this);
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Quiz("연습");

	}		
	@Override
	public void actionPerformed(ActionEvent e) {
		FileWriter fw = null;
		FileReader fr=null;
	    BufferedReader br = null;
	    //1.JTextField에 입력한 문자열을 읽어와서
	    File memoFile  = new File("c:\\acorn202210\\myFolder\\memo.txt");
	    
		try {
		//어떤 버튼을 눌렀는지 알아내서 결과를 얻어낼 수 있다.
		String command = e.getActionCommand();
		if(command.equals("추가")) {
			//1.JTextField에 입력한 문자열을 읽어와서
			String msg = inputMsg.getText();
			fw = new FileWriter(memoFile, true);
			fw.append(msg+"\r\n");
			fw.flush();
			
		}else if(command.equals("불러오기")) {
			fr = new FileReader(memoFile); 
	        br = new BufferedReader(fr);
	        //JTextArea에 이미 출력된 내용을 일단 삭제하고
            loadMsg.setText("");
			while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			loadMsg.append(line+"\r\n");
		  }
		}
	  }catch(Exception e2) {
		  e2.printStackTrace();
	  }
		finally {
	    	  try {
	    		//마무리 작업을 해줘야 하는데...
	    		  	if(br != null) br.close();
	    	        if(fr != null) fr.close();
	    	        if(fw != null) fw.close();
	    	  }catch(Exception e3) {
	    		  e3.printStackTrace();
	    	  }
	      }
	}
	
}
