package test.main;

import test.mypac.Weapon;

public class MainClass04 {
		
		// 내부 클래스, class에 static을 붙여줘야 밑에 static method를 사용할 수 있다.
		static class YourWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("공중 공격을 해요");		
		}
	}
	
		public static void main(String[] args) {
			Weapon w1 = new YourWeapon(); //여기서 YourWeapon은 쓰이지 않고 객체 생성만을 위한 것 
			useWeapon(w1);
	
			//Local Inner Class
			class OurWeapon extends Weapon{

				@Override
				public void attack() {
					System.out.println("지겹다, 이제 아무나 공격 하자");					
				}				
			}
			Weapon w2 = new OurWeapon();
			useWeapon(w2);
		}
	
		public static void useWeapon(Weapon w) {
			w.prepare();
			w.attack();
		}
}
