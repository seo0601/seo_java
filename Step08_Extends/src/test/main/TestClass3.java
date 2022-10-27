package test.main;

import test.mypac.Foods;
import test.mypac.Ramyeon;

public class TestClass3 {
	public static void main(String[] args) {
		Object p3 = new Ramyeon();
		Foods p2 = (Foods)p3;
		Ramyeon p1 = (Ramyeon)p3;
	}
}
