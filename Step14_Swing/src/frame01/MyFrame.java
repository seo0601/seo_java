package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

//실행 했 을때 Frame 창 만들기

public class MyFrame extends JFrame{
	
	//생성자
	public MyFrame(String title) {//자기 객체 안에 있기떄문에 this.은 생략 가능
		super(title);
		
		//프레임의 초기 설정 작업하기
		this.setBounds(100, 100, 500, 500); // x,y좌표와 폭,넓이
		
		//이 프레임(MyFrame)의 x버튼(close)버튼을 눌렀을 때 프로세스도 같이 종료되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//레이아웃 매니저는 아직 사용하지 않겠다.(모든 UI를 절대 좌표에 배치하겠다라는 의미)
		this.setLayout(null);
		
		//버튼을 하나 만들어서
		JButton btn1 = new JButton("버튼1");
		
		//위치 설정하고
		btn1.setLocation(10, 10);
		
		//크기 설정하고
		btn1.setSize(100, 30);
		
		//프레임 추가하기
		this.add(btn1);
		
		//프레임을 화면 상에 실제 보이게 하기(false를 넣으면 화면에 보이지 않는다.)
		this.setVisible(true);
	}
	
	//run 했을 때 실행의 흐름이 시작되는 특별한 메소드, 실행할 때마다 창이 뜨는데 각각 독립된 앱이다.
	public static void main(String[] args) {		
		//MyFrame 객체 생성하기
		new MyFrame("나의 프레임");
	}
}
