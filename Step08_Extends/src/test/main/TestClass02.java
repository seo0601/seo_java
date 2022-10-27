package test.main;

import test.mypac.Foods;
import test.mypac.Ramyeon;

public class TestClass02 {
	public static void main(String[] args) {
		Ramyeon p1 = new Ramyeon();
		Foods p2 = p1;
		Object p3 = p1;
	}
}
