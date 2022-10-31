package test.mypac;

public class MyRemocon implements Remocon{ //여러 개의 클래스를 implements 가능

	@Override
	public void up() {
		System.out.println("채널을 올려요");
	}

	@Override
	public void down() {
		System.out.println("채널을 내려요");
	}

}
