package frame05;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
		super(title);
		
		// this의 예약어를 이용해서 MyFrame 객체의 다형성 확인!
		MyFrame a = this;
		JFrame b = this;
		Component c = this;
		Object d = this;
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//JButton 타입의 sendBtn 변수를 만들어서 JButton 객체를 생성했고 버튼의 이름은 전송이라고 하겠다.
		JButton sendBtn = new JButton("전송");
		add(sendBtn);
		
		//ActionListener 인터페이스 type의 참조 값 얻어내서
		//ActionListener는 인터페이스이기 때문에 혼자 객체 생성이 안된다.
		ActionListener listener = new ActionListener() {//익명 클래스, implement ActionListener 한 것		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("전송 버튼을 눌렀네?");
				
				//showMessageDialog type을 전달해야 하기때문에 outer 클래스인 MyFrame.this로 전달해야한다.
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다");
				
			//ActionListener z = this; // 여기서 this는 ActionListener type이다.
			//Component f = MyFrame.this; //inner 클래스에서 outer 클래스를 가르킬 수 있다.			
			}
		};
		
		//전송 버튼에 등록하기
		sendBtn.addActionListener(listener);
		
		/*
		 *  삭제 버튼도 프레임에 배치하고, 해당 버튼을 눌렀을 때 "삭제 버튼을 눌렀네" 라는 메세지를 콘솔창에 출력되게 하기
		 */
		JButton delBtn = new JButton("삭제");
		add(delBtn);
		
		ActionListener delete = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("삭제 버튼을 눌렀네?");
				JOptionPane.showMessageDialog(MyFrame.this, "삭제합니다");
			}
		};
		delBtn.addActionListener(delete);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame("나의 프레임5");
		f.setVisible(true);
	}
}
