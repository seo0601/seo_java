package test.main;

import java.util.Random;

public class QuizMain2 {
	public static void main(String[] args) {
		/* 2. run 했을때 밑에처럼 한번에 랜덤하게 출력하게 하기
		 * cherry|apple|cherry
		 * 7|apple|melon
		 * 7|7|7 
		 */
		
		// 문자열 여러 개을 순차적으로 관리하기 위한 객체
		String[] items = {"cherry", "apple", "banana", "melon", "7"};
		
		// 랜덤한 숫자를 얻어내기 위한 객체
		Random ran = new Random();			
		
		for(int i=0; i<3; i++) {
			// 0~4 사이의 랜덤한 숫자 얻어내기
			int ranNum = ran.nextInt(5);
			
			// 배열의 인덱스를 활용해서 문자열 출력하기
			System.out.print(items[ranNum]);
			
			// or i !=2도 된다.
			if(i<2) {
				System.out.print("|");
			}
		}
	
	}
}
