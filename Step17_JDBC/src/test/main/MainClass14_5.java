package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

//MemberDao 활용하기
public class MainClass14_5 {
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		MemberDto data = dao.getData(10);
		if(data == null) {
			System.out.println("회원 정보가 없습니다.");
		}else {
			System.out.println("번호 :" +data.getNum()+ "이름 :" +data.getName()+" 주소:"+data.getAddr());
		}
	}
}
