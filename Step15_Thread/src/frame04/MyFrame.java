package frame04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.mypac.AnotherThread;
import test.mypac.CountRunnable;
import test.mypac.CountThread;

//실행 했 을때 Frame 창 만들기

public class MyFrame extends JFrame implements ActionListener{
	
	//생성자
	public MyFrame(String title) {//자기 객체 안에 있기떄문에 this.은 생략 가능
		super(title);
		
		//프레임의 초기 설정 작업하기
		this.setBounds(100, 100, 500, 500); // x,y좌표와 폭,넓이
		
		//이 프레임(MyFrame)의 x버튼(close)버튼을 눌렀을 때 프로세스도 같이 종료되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		this.setLayout(new FlowLayout());
		
		JButton startBtn = new JButton("카운트 다운 시작");
		startBtn.addActionListener(this);
		
		//프레임에 버튼 추가하기
		add(startBtn);
		
		JTextField tf = new JTextField(10);
		// 프레임에 JTextField 추가
		add(tf);
		
		//프레임을 화면 상에 실제 보이게 하기(false를 넣으면 화면에 보이지 않는다.)
		this.setVisible(true);
	}
	
	//run 했을 때 실행의 흐름이 시작되는 특별한 메소드, 실행할 때마다 창이 뜨는데 각각 독립된 앱이다.
	public static void main(String[] args) {		
		//MyFrame 객체 생성하기
		new MyFrame("나의 프레임");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("카운트 다운을 시작합니다.");
		
		// Runnable 인터페이스를 구현한 클래스로 객체를 생성해서
		//Runnable r = new CountRunnable(); 
		
		// Thread 객체를 생성하면서 인자로 전달
		//Thread t = new Thread(r);
		
		// Thread 객체이 start() 메소드를 호출해서 새로운 스레드 시작시키기
		//t.start();	
		
		//위의 코드 3줄을 한줄로 표현하면
		new Thread(new CountRunnable()).start();
	}
}
