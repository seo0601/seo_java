package test.main;

import java.util.Random;
import java.util.Scanner;

public class testmain {
	public static void main(String[] args) {
		
		int point = 1000;
		Scanner scan = new Scanner(System.in);
		
		// while은 true일때 무한 루프가 된다.
		while(true) {
			
			// 만일 point가 0이면 
			if(point ==0) {
				break; //반복문 loop 탈출
			}
			System.out.println("Enter를 누르세요");
			
			//Enter를 치기 전까지 멈춰있는 메소드 호출
			scan.nextLine();
			
			// point값을 10씩 감소하는 연산자
			point -= 10;
		
			String[] items = {"cherry", "apple", "banana", "melon", "7"};
			Random ran = new Random();	
			int[] nums = new int[3];
			
			for(int i=0; i<3; i++) {
				int ranNum = ran.nextInt(5);
				System.out.print(items[ranNum]);
				if(i<2) {
					System.out.print("|");
				}
				nums[i] = ranNum;	
			}
			System.out.println();
			
			boolean isAllEqual = nums[0] == nums[1] && nums[1] == nums[2];
			boolean isTwoEqual = nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2];
			if(isAllEqual) {
				System.out.println(": 10점 입니다.");
			}else if(isTwoEqual) {
				System.out.println(": 5점 입니다.");
			}else {
				System.out.println(": 0점 입니다.");
			}
			
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
