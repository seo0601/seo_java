package test.main;

import java.util.Random;

import test.mypac.WowException;

public class MainClass05 {
	
	public static void main(String[] args) {
		Random ran = new Random();
		//0~4 사이의 랜덤한 정수 얻어내기
		int ranNum = ran.nextInt(5);
		
		//우연히 가장 큰 수인 4가 나오면 WowException을 발생시키기
		try {
		if(ranNum == 4) {
			throw new WowException("놀랍네 이거 ㄷㄷ");
		}
		}catch(WowException w) {
			
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}
