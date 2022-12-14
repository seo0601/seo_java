package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		// 5초동안 출력을 지연시키고 출력시키기, try-catch를 써야 한다.
		try {
			/*
			 *  실행의 흐름을 스레드라고 하는데 스레드를 임의로 5초동안 잡아두기
			 *  컴파일 시에 발생하는 Exception이 발생하기 때문에 반드시 try~catch 블럭으로
			 *  예외 처리를 해야 한다.
			 */
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
