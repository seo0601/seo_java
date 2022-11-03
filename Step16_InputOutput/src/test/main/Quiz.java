package test.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	public Quiz(String title) {
		super(title);
		setBounds(100,100,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		inputMsg = new JTextField(10);
		JButton addBtn = new JButton("추가");
		JTextArea loadMsg = new JTextArea();
		JButton loadBtn = new JButton("불러오기");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
