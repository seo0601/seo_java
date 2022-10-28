package test.main;

import java.util.Scanner;

import test.mypac.Weapon;

public class MainClass05 {
	//필드는 코딩을 하는 곳이 아니라 변수 선언, 값을 만들어 대입, new 만들어서 선언정도 할 수 있다.
	//필드를 선언하면서 값 얻어내서 대입하는 코드
	int num = 999;
	String name = "Kim";
	Scanner scan = new Scanner(System.in);
	
	//필드는 선언만 하면 기본 값이 들어간다.
	int weight; // 0
	boolean isRun; // false
	String msg; // null
	Scanner scan2; // null

	//static 영역에 올리고 싶은 필드는 static 예약어를 이용해서 만든다.
	static String greet = "안녕";
	
	//static Weapon w1; >>이거는 null을 전달한 것과 같다.
	
	// {}이거는 class이지만 이름이 없다 Weapon은 추상 클래스를 상속받은 것이 된다.그래서 override가 강제된다.
	// Anonymous Inner Class를 이용해서 Weapon Type의 참조값 얻어내기
	static Weapon w1 = new Weapon() {
		@Override
		public void attack() {
			System.out.println("무엇인지 모르겠지만 공격하자");	
		}	
	};
	
	public static void main(String[] args) {
		useWeapon(w1);
	
		//Anonymous Local Inner Class를 이용해서 Weapon type의 참조값 얻어내기
		Weapon w2 = new Weapon() { //여기서는 static 메소드 안에 있어서 static 안써도 된다.
							   	
			@Override
			public void attack() {
				System.out.println("다시 공격하자");
				}	
		};
		useWeapon(w2);
		
		// 변수를 한 번만 사용하고 사용하지 않을 경우 이렇게도 써도 된다. 안드로이드개발에서 자주 쓸 예정
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("신기하게 공격하기");
			}			
		});
	}
	
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
