package frame06;

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
		
		// {}는 익명클래스이다.이름은 없고 extends Thread 한 것이다.
		new Thread() {
			public void run() {
				//카운트 값을 저장할 지역 변수를 만들고 초기 값 대입
				int count = 10;
				
				//무한 루프인 while문
				while(true) {
					System.out.println("현재 카운트 : " + count);
					
					if(count == 0) { //만일 count가 0이 되면 
						break; // 반복문 탈출(반복문을 탈출하면 run() 메소드가 리턴되기 때문에 스레드가 종료된다.
					}
					try { //1초 대기
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//count 1씩 감소시키기
					count--;
				}
			};
		}.start();

	}
	
}
