package test.mypac;

public class SmartPhone extends HandPhone {
	
	// 생성자
	public SmartPhone() {
		System.out.println("SmartPhone 생성자 호출됨");
	}
	
	//메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	@Override //덮어쓴다는 의미이다.
	public void takePicture() {
		
		//super.takePicture(); > 부모(HandPhone)의 메소드도 호출한다.
		System.out.println("1000만 화소의 사진을 찍어요!");
	}
}
