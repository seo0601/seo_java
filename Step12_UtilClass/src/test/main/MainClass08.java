package test.main;
/*
 *  while 문을 활용해서 원하는 횟수만큼 반복하기
 *  
 *  - 반복 횟수가 명확히 정해져 있으면 for 문으로 반복물을 사용하고
 *  - 반복 횟수가 명학히 정해져 있지 않고 반복을 해봐야 횟수를 아는 경우 while 문으로 반복문을 사용한다.
 */
public class MainClass08 {
	public static void main(String[] args) {
		//밑에 2개의 while 문을 익혀두자
		
		// 카운트를 셀 변수를 미리 만들어서 0으로 초기화
		int count = 0;
		
		// 무한 루프로 돌다가
		while(true) {
			System.out.println("안녕!");
			count++;
			
			// 특정 조건 하에서 무한 루프 빠져 나오기
			if(count == 5) {
				break;
			}
		}
		System.out.println("---------------------------");
		count = 0; // 카운트를 다시 0으로 만들고
		
		//카운트가 5보다 작은 동안에 반복문 수행하기
		while(count<5) {
			System.out.println("안녕!");           //>> for문의 로직과 유사하다.
			count++;
		}
		
		for(;;) {} // >> while문과 같은 무한 루프이다.
	}
}
