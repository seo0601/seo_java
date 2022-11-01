package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력: ");
		
		//숫자 형식의 문자열을 입력 받는다. "10", "20", "10.1" 등등
		String intputNum = scan.nextLine();
		
		//에러가 없다면 정상적으로 진행, 에러가 나면 catch에 있는 것을 실행하고 나온다.try-catch는 에러를 예외 처리한다.
		//이러한 에러는 runtime시 발생한 에러이고 컴파일 시 에러는 자바에서 바로 에러 표시가 난다.
		try {	
			//입력한 숫자(문자열)를 실제 숫자로 바꾼다.
			double num = Double.parseDouble(intputNum);
		
			//입력한 숫자에 100을 더한다.
			double result = num = 100;
			System.out.println("입력한 숫자 + 100 :" + result);
		}catch(NumberFormatException nfe) {
			/*
			 *  실행 스택에서 일어난 일을 콘솔 창에 출력하기
			 *  (자세한 예외 정보를 예외 객체가 콘솔 창에 출력하게 하기), 에러 코드를 콘솔 창에 출력
			 */
			nfe.printStackTrace();
		}
			
		System.out.println("무언가 중요한 마무리 작업을 하고 main 메소드가 종료됩니다.");
	}
}
