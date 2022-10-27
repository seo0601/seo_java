package test.main;

import java.util.Random;

public class QuizMain3 {
	public static void main(String[] args) {
		// 3개가 모두 같게 나왔다면 10점을 부여하기
		
		// 문자열 여러 개을 순차적으로 관리하기 위한 객체
		String[] items = {"cherry", "apple", "banana", "melon", "7"};
		
		// 랜덤한 숫자를 얻어내기 위한 객체
		Random ran = new Random();			
		
		// for문 안에서 얻어낸 랜덤한 숫자 3개를 저장할 배열 객체 생성
		int[] nums = new int[3];
		
		for(int i=0; i<3; i++) {
			// 0~4 사이의 랜덤한 숫자 얻어내기
			int ranNum = ran.nextInt(5);
			
			// 배열의 인덱스를 활용해서 문자열 출력하기
			System.out.print(items[ranNum]);
			
			// or i !=2도 된다.
			if(i<2) {
				System.out.print("|");
			}
			// 배열에 얻어낸 랜덤한 숫자를 저장하기, i에는 그러면 for문의 조건인 0,1,2가 들어간다.
			nums[i] = ranNum;	
		}
		//이렇게만 하면 개행이 된다.
		System.out.println();
		
		// nums 배열에 저장된 3개의 숫자가 모두 같은지 여부를 boolean type으로 얻어내기
		boolean isEqual = nums[0] == nums[1] && nums[1] == nums[2];
		if(isEqual) {
			System.out.println(": 10 점 입니다.");
		}else {
			System.out.println(": 0 점 입니다.");
		}
	}
}
