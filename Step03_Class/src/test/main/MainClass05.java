package test.main;

import test.mypac.Rect;

/*
 *  test.mypac 패키지에 Rect라는 이름의 클래스를 만들고자 한다.
 *  
 *  해당 클래스의 객체를 생성하고
 *  
 *  사각형의 폭과, 높이를 필드에 대입하고
 *  
 *  showArea()를 호출하면 사각형의 넓이가 콘솔 창에 출력될 수 있도록 
 *  
 *  Rect 클래스를 설계해 보세요.
 */
public class MainClass05 {
	public static void main(String[] args) {
		Rect s = new Rect();
		s.width = 10;
		s.height = 10;		
		s.showArea();
	}
}
