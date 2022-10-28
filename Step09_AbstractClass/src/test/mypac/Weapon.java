package test.mypac;

//미완성된 추상 메소드를 멤버로 가지고 있는 클래스는 abstract 예약어를 붙여서 정의해야 한다.
public abstract class Weapon {
	
	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}
	
	//공격을 하는 메소드의 모양만 정의하고 실제 구현은 하지 않기
	//미완성된 추상 메소드를 만들 때는 abstract 예약어가 필요하다
	public abstract void attack(); 
}
// 왜 abstract를 사용할까? 무엇을 공격할지 결정되지 않았다면 abstract를 사용해서 결정되었을때 
// override를 사용해서 공격을 하면 된다.