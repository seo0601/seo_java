package test.main;

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
		
			//원하는 작업 수행...
			System.out.println("수행 중..."); //여기다 퀴즈메인4 넣어서 테스트
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
