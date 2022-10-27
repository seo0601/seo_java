package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		// 1. run 했을때 cherry, apple, banana, melon,7 이 1개가 랜덤하게 출력
		// 문자열 여러 개을 순차적으로 관리하기 위한 객체
		String[] items = {"cherry", "apple", "banana", "melon", "7"};
		
		// 랜덤한 숫자를 얻어내기 위한 객체
		Random ran = new Random();
		
		// 0~4 사이의 랜덤한 숫자 얻어내기
		int ranNum = ran.nextInt(5);
		
		// 배열의 인덱스를 활용해서 문자열 출력하기
		System.out.println(items[ranNum]);
	}
}
