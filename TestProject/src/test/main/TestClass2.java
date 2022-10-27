package test.main;

import java.util.Random;

public class TestClass2 {

	public static void main(String[] args) {
		/* 2. run 했을때 밑에처럼 한번에 랜덤하게 출력하게 하기
		 * cherry|apple|cherry
		 * 7|apple|melon
		 * 7|7|7 
		 */
		String[] items = {"cherry", "apple", "banana", "melon", "7"};
		Random ran = new Random();
		int ranNum = ran.nextInt(5);
		
		int ranNum1 = ran.nextInt(5);
		int ranNum2 = ran.nextInt(5);
		int ranNum3 = ran.nextInt(5);
		System.out.println(items[ranNum1]+"|"+items[ranNum2]+"|"+items[ranNum3]);
		
		if(ranNum1 == ranNum2 && ranNum2 == ranNum3  ) {
			System.out.println("축하합니다");
		}else {
			System.out.println("아쉽네요");
		}
		
	}
}
