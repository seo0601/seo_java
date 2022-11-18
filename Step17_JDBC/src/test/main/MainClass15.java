package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 추가할 회원의 이름과 주소를 각각 입력받아서
		 *  MemberDto 객체에 담고 MemberDao 객체를 이용해서 DB에 저장하는 프로그래밍을 해보세요.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("추가할 이름을 입력하세요");
		String name = scan.nextLine();
		System.out.println("추가할 주소를 입력하세요");
		String addr = scan.nextLine();
		
		//입력받은 이름을 MemberDto 객체에 담고
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		//MemberDao 객체를 생성해서
		MemberDao dao = new MemberDao();
		
		//DB에 저장 = dao.insert(dto);
		boolean isSuccess = dao.insert(dto);
		if(isSuccess) {//성공하면
			System.out.println(name +" 의 정보를 추가했습니다.");
		}else {//실패하면
			System.out.println("회원 정보 추가 실패");
		}
	}
}
