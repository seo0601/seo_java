package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class TestClass {
	public static void main(String[] args) {
		Weapon w = new MyWeapon();	
		w.prepare();
		w.attack();
	}
	


}
