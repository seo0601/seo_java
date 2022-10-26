package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  0~9 사이의 랜덤한 정수를 얻어내서 콘솔 창에 출력하고 싶다.
		 *  
		 *  hint) Random 클래스를 import해서 사용
		 */
		
		// random 객체를 생성해서
		Random ran = new Random();
		
		// nextInt() 메소드를 호출해서 정수를 리턴 받아서
		int ranNum = ran.nextInt(10);
		
		// 콘솔 창에 출력해보기
		System.out.println(ranNum);
		
		// 1~45 사이의 랜덤한 정수 하나를 얻어내서 ranNum2 이라는 지역 변수에 담아보세요
		int ranNum2 = ran.nextInt(1, 46); //1이상 46미만의 범위
		int ranNum3 = ran.nextInt(45)+1; // 이렇게도 가능
		System.out.println(ranNum2);
		
		// true or false 중에 랜덤한 boolean 값을 얻어내서 isRun이라는 지역 변수에 담아보세요.
		boolean isRun = ran.nextBoolean();
		System.out.println(isRun);
	}
}
