package test.mypac;

public class Sound implements Remocon{

	@Override
	public void up() {
		System.out.println("소리를 한 칸 올려요");
	}
	@Override
	public void down() {
		System.out.println("소리를 한 칸 내려요");
	}

}
