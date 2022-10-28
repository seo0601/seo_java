package test.main;

import java.util.Random;

public class TestClass {
	public static void main(String[] args) {
		// 1. run 했을때 cherry, apple, banana, melon,7 이 1개가 랜덤하게 출력
		String[] items = {"cherry", "apple", "banana", "melon", "7"};
		
		Random ran = new Random();
		int ranNum = ran.nextInt(5);
		System.out.println(items[ranNum]);
		}
	
}
