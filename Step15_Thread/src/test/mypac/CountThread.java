package test.mypac;

public class CountThread extends Thread{
	
	@Override
	public void run() {
		//카운트 값을 저장할 지역 변수를 만들고 초기 값 대입
		int count = 10;
		
		//무한 루프인 while문
		while(true) {
			System.out.println("현재 카운트 : " + count);
			
			if(count == 0) { //만일 count가 0이 되면 
				break; // 반복문 탈출(반복문을 탈출하면 run() 메소드가 리턴되기 때문에 스레드가 종료된다.
			}
			try { //1초 대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//count 1씩 감소시키기
			count--;
		}
	}
}
