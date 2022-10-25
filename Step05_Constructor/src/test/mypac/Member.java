package test.mypac;

public class Member {
	
	//번호를 저장할 필드
	public int num;
	
	//이름을 저장할 필드
	public String name;
	
	//주소를 저장할 필드
	public String addr;
	
	//생성자를 밑에처럼 하나라도 정의하면 기본 생성자는 없다고 간주되기 때문에
	//기본 생성자도 필요하면 명시적으로 정의해야 한다.
	public Member() {
		//실행할 코드가 없으면 빈 칸으로 해도 상관없다.
	}
	
	//클래스 이름과 같고 리턴이 없으니 생성자이다. void를 쓰면 생성자가 아니다.
	//3개의 인자를 전달받을 준비가 된 생성자, 보통 필드에 저장하는 경우가 많다.
	public Member(int num, String name, String addr) {// 생성자에도 매개 변수 선언 가능
		
		//생성자의 인자로 전달받은 값을 필드에 저장하기
		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	//메소드
	public void showInfo() {
		//필드에 저장된 내용을 활용해서 정보를 출력하기
		System.out.println("번호:"+this.num+", 이름:"+this.name+", 주소:"+this.addr);
	}
}
