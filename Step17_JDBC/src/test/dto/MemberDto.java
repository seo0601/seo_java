package test.dto;

public class MemberDto {
	//회원 한명의 정보를 저장할 필드(보통 테이블의 칼럼명과 일치시킨다.)
	private int num;
	private String name;  //private는 dto.num 이런식으로 안된다.
	private String addr;
	
	//디폴트 생성자
	//{}안에서 우클릭 > 소스 > 제너리틱 컨스트럭터 유징 필드 > 제네릭 >> 밑에처럼 자동으로 완성해준다.
	public MemberDto() {}

	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	// 빈공간에서 우클릭 > 소스 > 제너리틱 게터 앤 세터 > 제네릭하면 밑에처럼 된다.
	public int getNum() {
		return num;
	}

	public void setNum(int num) { //dto.setNum(1); 이렇게 사용
		this.num = num;			  //int num = dto.getNum(); num불러오기	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) { //dto.setName("kim"); 이렇게 사용
		this.name = name;			   //String name = dto.getName(); name 불러오기
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
