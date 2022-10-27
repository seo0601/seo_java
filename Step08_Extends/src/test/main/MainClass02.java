package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 *  지역 변수나 필드 앞에 선언하는 data type은 (참조 data type)
 *  
 *  그 안에 들어있는 참조 값의 사용 설명서라고 생각하면 된다.
 *  
 *  그렇기 때문에 그 지역 변수나 필드에 .을 찍으면 사용 설명서에 명시된 기능만 사용할 수 있다.
 *  
 *  java의 모든 객체는 다형성을 가질 수 있다.
 *  
 *  다형성은 type이 여러개 라는 의미이다.
 */

public class MainClass02 {
	public static void main(String[] args) {
		
		//다형성 확인, p는 HandPhone, Phone, Object 타입을 가질 수 있다.
		HandPhone p1 = new HandPhone();
		
		//어떤 객체의 참조 값을 부모 type으로 받을 수 있다.
		Phone p2 = new HandPhone(); 
		Object p3 = new HandPhone();
		
		/*
		 * p2. 은 phone 박스에 담겨져 있기 때문에 HandPhone 기능을 사용 불가
		 * p3. 은 Object 박스에 담겨져 있기 때문에 Phone, HandPhone 기능 사용 불가
		 * 왜 이런 식으로 사용할까? 프로그램이 유연해진다.
		 */
		
		
	}
}
