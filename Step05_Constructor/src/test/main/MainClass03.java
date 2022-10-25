package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  1. MacBook 객체를 생성해서 참조 값을 mac1이라는 지역 변수에 담아 보세요.
		 *  단, MacBook 클래스를 수정하지 마세요.
		 */            // Cpu cpu = new Cpu()를 생각하자.
		MacBook mac1 = new MacBook(new Cpu(), new Memory(), new HardDisk());
		
		// 2. mac1 지역 변수에 들어있는 참조 값을 이용해서 .doGame()이라는 메소드를 호출해 보세요
		mac1.doGame();
		
		// MacBook 클래스의 생성자의 인자로 전달한 값이 지역 변수에 준비가 되어 있다면
		Cpu c1 = new Cpu();
		Memory m1 = new Memory();
		HardDisk h1 = new HardDisk();
		
		// 아래와 같이 MacBook 객체를 생성할 수 있다.
		MacBook mac2 = new MacBook(c1,m1,h1);
		mac2.doGame();
	}
}
