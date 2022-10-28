package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		
		//HandPhone 객체를 생성해서 그 참조 값을 Object type p3 지역 변수에 담는다.
		Object p3 = new HandPhone();
		
		//Object type 변수에 담긴 값을 Phone type p2 변수에 담기
		Phone p2 =(Phone)p3; // casting, p3를 Phone 타입이라고 강제로 인식시키기
		
		//Object type 변수에 담긴 값을 HandPhone type p1 변수에 담기
		HandPhone p1 = (HandPhone)p3; //casting 연산자를 이용하면 가능하다.
		
		//casting을 잘못하면 문법 에러는 안나지만 Run했을 때 에러가 난다.
		//확실할 때만 casting을 해야 한다.
		
	}
}
