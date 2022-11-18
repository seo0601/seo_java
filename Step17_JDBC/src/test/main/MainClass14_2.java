package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

//MemberDao 활용하기
public class MainClass14_2 {
	public static void main(String[] args) {
		//삭제할 회원의 num
		int num = 7;
		MemberDao dao = new MemberDao();
		boolean isSuceess = dao.delete(7);
		if(isSuceess) {
			System.out.println("회원 정보를 삭제했습니다.");
		}else {
			System.out.println("회원 정보 삭제를 실패했습니다.");
		}
	}
}
