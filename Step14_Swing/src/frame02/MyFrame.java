package frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//흐르듯이 배치하는 레이아웃, 왼쪽으로 정렬하겠다. default는 가운데 정렬이다.
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btn1 = new JButton("버튼1");
		add(btn1); //프레임에 btn1 추가하기
		
		JButton btn2 = new JButton("버튼2");
		add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		add(btn3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임2"); // 나의 프레임2는 String title에 전달되고 이것이 다시 super(title)에 전달된다.
	}
}
