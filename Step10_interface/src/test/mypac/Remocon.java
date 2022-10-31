package test.mypac;
/*
 *  [ interface ]
 *  
 *  - 생성자가 없다 ( 단독 객체 생성 불가), new 할 수가 없다
 *  - 구현된 메소드는 가질 수 없다.(추상 메소드만 가질 수 있다.)
 *  - 필드는 static final 상수만 가질 수 있다.
 *  - data type의 역할을 할 수 있다. >> Remocon r = null; 이런게 가능
 *  - interface type의 참조 값이 필요하면 구현(implements) 클래스를 만들어서
 *    객체를 생성해야 한다.
 *  - 클래스 상속은 단일 상속이지만, 인터페이스는 다중 구현이 가능하다.
 *  - 인터페이스도 다형성에 기여한다.  	
 */
public interface Remocon {
	//메소드를 강제해서 객체의 표준을 정하는 느낌이다. 모양 자체는 완벽한 클래스이다.
	
	//필드는 static final 필드만 가질 수 있다.(static final은 생략 가능), static 영역에 Company가 올라간다.
	
	public static final String COMPANY = "LG";

	//메소드는 추상 메소드만 정의할 수 있다.
	public void up();
	public void down();
}
