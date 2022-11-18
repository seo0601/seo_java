package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

//MemberDao 활용하기
public class MainClass14_3 {
	public static void main(String[] args) {
		//수정할 회원의 정보라고 가정
		int num = 10;
		String name = "서동민";
		String addr = "중앙동";
		
		/*
		 *  MemberDao 객체를 생성해서 참조 값 dao라는 지역 변수에 담기
		 */
		MemberDao dao = new MemberDao();		
		MemberDto dto = new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		boolean isSuccess = dao.update(dto);
		if(isSuccess) {
			System.out.println(name +" 의 정보를 수정했습니다.");
		}else {
			System.out.println("회원 정보 수정 실패");
		}
	}
}
