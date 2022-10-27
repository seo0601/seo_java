package test.main;

import java.util.Random;

public class TestClass3 {
	public static void main(String[] args) {
		String[] items = {"cherry", "apple", "banana", "melon", "7"};
		Random ran = new Random();
		int ranNum = ran.nextInt(5);
		
		int[] nums = new int[3];
		
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = ran.nextInt(5);
			System.out.print(items[nums[i]]);
			
			if(i<2) {
				System.out.print("|");
			}
			
		}
	}
}
