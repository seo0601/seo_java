package test.main;

import test.mypac.Car;

//import test.mypac.Car;
/*
 *  import 하는 방법
 *  1. 클래스명을 작성하고 ctrl + space => 좀 더 자주 쓰임
 *  2. ctrl + Shift + o
 */

public class MainClass01 {
	
	public static void main(String[] args) {
		//test.mypac 패키지에 있는 Car 클래스로 객체를 생성해서 참조값을 얻어냈지만 사용하지 않고 버리기
		new Car();
		
		//test.mypac 패키지에 있는 Car 클래스로 객체를 생성해서 car1이라는 지역 변수에 담기
		Car car1 = new Car();
		
		//필드에 값 대입하기
		car1.name = "소나타";
		
		//메소드 호출하기
		car1.drive();
		car1.stop();
		
		Car car2 = new Car();
		car2.name="람보르기니";
		car2.drive();
		car2.stop();
	}

}
