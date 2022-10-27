package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		
		//자식에게 사준 일반 핸드폰(인터넷 안됨)
		HandPhone p1 = new HandPhone(); //new SmartPhone();이라 써야 밑에 오류가 안남
		
		//엄마! 나도 SmartPhone이 갖고 싶어!!!
		
		//엄마가 새로운 설명서를 가져왔어 이제 그 폰은 SmartPhone이야
		SmartPhone p2 = (SmartPhone)p1; // ClassCastException(클래스 캐스팅 오류) 발생!
		
		//진짜? 엄마 짱이다~, 나 이제 인터넷 한다.
		p2.doInternet();
	}
}
