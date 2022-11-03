package test.mypac;
/*
 *  새로운 스레드를 만드는 방법2
 *  
 *  1. Runnable 인터페이스르 구현한 클래스를 정의한다.
 *  2. run() 메소드를 강제 오버라이드 한다.
 *  3. Thread 클래스로 객체를 생성하면서 해당 클래스로 만든 객체를 생성자의 인자로 전달한다.
 *     ex) new Thread(new CountRunnable()).start() >> 이런 식
 *  4. Thread 클래스로 만든 객체의 start() 메소드를 호출해서 스레드를 시작시킨다.
 */
public class CountRunnable implements Runnable { //Runnable에는 run()메소드만 있다.(object메소드도 있다.)
	
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
