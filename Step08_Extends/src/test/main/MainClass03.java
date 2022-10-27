package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		
		//객체는 new 했을 때 만들어진다. 밑에는 객체1개가 만들어졌고 지역 변수 3개가 만들어진 것.
		//HandPhone 객체를 생성해서 그 참조 값을 p1이라는 이름의 HadnPhone type 지역 변수에 대입하기
		HandPhone p1 = new HandPhone();
		
		//p1 안에 있는 참조 값을 p2라는 Phone data type 지역 변수에 대입하기
		Phone p2 = p1;
		
		//p1 안에 잇는 참조 값을 p3라는 Object type 지역 변수에 대입하기
		Object p3 = p1;
		
		//자식 객체의 참조 값은 부모 type 변수나 필드에 자연스럽게 담긴다.
		/*
		 * 핸드폰의 참조 값을 폰, 오브젝트에 담기 가능, 폰의 참조 값을 오브젝트에 담기 가능, 
		 * 오브젝트의 참조 값을 자식한테 담기는 안된다. 담을려면 casting을 해줘야함
		 */
	}
}
