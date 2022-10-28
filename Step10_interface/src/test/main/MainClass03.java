package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	// anonymous inner class를 이용해서 interface type의 참조 값을 얻어내기
	// static 메소드 안에서 사용해야 되기 때문에 static 필드로 만들어 준다.
	static Remocon r1 = new Remocon() { // {}; >> class는 없고 implements Remocon과 같다.
								 // new Remocon은 constructor call을 한 것이다.
		@Override
		public void up() {
			System.out.println("온도를 올려요");
		}
		
		@Override
		public void down() {
			System.out.println("온도를 내려요");
		}
	};	
	
	public static void main(String[] args) {
		useRemocon(r1);
		
		Remocon r2 = new Remocon() {			
			@Override
			public void up() {
				System.out.println("속도를 높여요");
			}
			
			@Override
			public void down() {
				System.out.println("속도를 낮춰요");
			}
		};
		useRemocon(r2);
		
		//메소드를 호출하면서 Remocon type을 즉석으로 얻어내서 전달하기
		useRemocon(new Remocon() {			
			@Override
			public void up() {
				System.out.println("청기 올려");
			}
			
			@Override
			public void down() {
				System.out.println("백기 내려");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
