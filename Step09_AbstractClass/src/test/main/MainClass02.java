package test.main;

import test.mypac.Gun;
import test.mypac.SeoWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	
	// run 했을 때 실행의 흐름이 시작 되는 특별한 main 메소드
	public static void main(String[] args) { 
		//main(){}은 스태틱 영역에 올라간다. 따라서 static을 안쓴 test(){} 기능 사용불가
		
		// 동일 클래스 안에 잇는 static 메소드 호출 가능
		test("안녕!"); // >> MainClass02.test();에서 MainClass02가 생략이 된 것이다.
		
		// 직접 클래스르 만들고 객체를 생성을 해서 아래의 useWeapon() 메소드를 호출해 보세요
		Weapon wp = new SeoWeapon();
		useWeapon(wp);
		
		//Weapon g가 아닌 Gun g로 받아도 된다.
		Weapon g = new Gun(); //내가 만든 gun 객체가 useWeapon으로 전달되어서 어떤 일을 한다.
		useWeapon(g);
	}
	
	public static void test(String msg) {
		System.out.println(msg);
	}
	
	// Weapon type을 인자로 전달 받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
