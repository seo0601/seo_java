package test.main;

import test.mypac.Weapon;

public class TestClass {
	
	Weapon w1 = new Weapon() {		
		@Override
		public void attack() {
			System.out.println("공격 그만");
		}
	};
	
	public static void main(String[] args) {
		Weapon w2 = new Weapon() {			
			@Override
			public void attack() {
				System.out.println("다시 공격");
			}
		};
		useWeapon(new Weapon() {			
			@Override
			public void attack() {
				System.out.println("마지막 공격");			
			}
		});
	}
	
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}

}
