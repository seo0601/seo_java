package test.main;

import java.util.Scanner;
/*
 * main 메소드 안에서 만든 지역 변수
 * String[] mgs, Scanner scan, int i, String line(5개) ,int i, String tmp(5개)
 */
public class MainClass06 {
	public static void main(String[] args) {
		// 1. 문자열을 저장할 수 있는 방 5개짜리 배열 객체를 생성해서 msgs라는 지역 변수에 담기
		String[] msgs = new String[5];
		
		// 2. 키보드로부터 입력을 받을 수 있는 Scanner 객체를 생성해서 참조 값을 scan이라는 지역 변수에 담기
		Scanner scan = new Scanner(System.in);  
		
		// 3. 반복문을 위에서 생성한 배열의 방의 갯수만큼 돌면서 키보드로부터 문자열을 입력받아서
		//    배열에 순서대로 저장한다.
		for(int i=0; i<msgs.length; i++) {
			System.out.print("문자열 입력 : ");
			
			//msgs[i] = scan.nextLine(); 이렇게도 한 줄로도 가능
			
			String line = scan.nextLine(); //문자열 한 줄 입력 받기, 여기서 line변수는 총 5번 만들어짐
			
			//배열의 i번째 방에 저장
			msgs[i] = line;
		}
		// 4. 반복문을 돌면서 배열에 저장되었던 모든 문자열을 순서대로 콘솔 창에 출력하기
		// for문에서 i는 for문에서 사용되고 사라져서 또 사용이 된다.
			for(int i = 0; i <msgs.length; i ++) {
			String tmp = msgs[i ];      //바로 출력해도 되지만 담아놓고 출력도 해보자, tmp변수는 총 5번 만들어짐
			System.out.println(tmp);
		}
	}	        
}

