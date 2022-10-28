package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		
		//추상메소드
		useDrill(new Drill() {		
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요");
			}
		});
		
		// ()는 추상 메소드에서 (), {}는 추상 메소드에서 {}이다. 결국 위에 있는 추상 메소드를 줄인 표현이다.
		// 오직 오버라이드 할 메소드가 하나일 경우만 가능하다. 꼭 사용 안해도 됨, 편한대로 쓰기
		useDrill(()->{
			System.out.println("천장에 구멍을 뜷어요");
		}); 
	}
	
	// 1개의 추상 메소드로 구성되어 있는 Drill 객체를 인자로 전달받는 메소드
	public static void useDrill(Drill d) {
		d.hole();
	}
	
}
