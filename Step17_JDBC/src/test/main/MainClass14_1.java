package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

//MemberDao 활용하기
public class MainClass14_1 {
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가정
		String name = "원숭이";
		String addr = "동물원";
		
		/*
		 *  회원의 정보를 DB에 저장하는 기능을 가지고 있는 
		 *  MemberDao 객체를 생성해서 참조 값 dao라는 지역 변수에 담기
		 */
		MemberDao dao = new MemberDao();
		
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		//MemberDao 객체를 이용해서 회원 정보를 추가하고 성공 여부를 리턴 받는다.
		boolean isSuccess = dao.insert(dto);
		//성공 여부에 따른 동작을 한다.
		if(isSuccess) {//성공하면
			System.out.println(name +" 의 정보를 추가했습니다.");
		}else {//실패하면
			System.out.println("회원 정보 추가 실패");
		}
	}
}
