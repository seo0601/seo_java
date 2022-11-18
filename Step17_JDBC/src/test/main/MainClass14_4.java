package test.main;

import java.util.List;

import test.dao.FriendDao;
import test.dao.MemberDao;
import test.dto.FriendDto;
import test.dto.MemberDto;

//MemberDao 활용하기
public class MainClass14_4 {
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.getList();
		for(int i=0; i<list.size(); i++) {
			MemberDto tmp = list.get(i); 
			System.out.println(tmp.getNum()+" | "+tmp.getName()+" | "+tmp.getAddr());			
		}
		System.out.println("----------------------------------------");
		for(MemberDto tmp:list) {
			 System.out.println(tmp.getNum()+" | "+tmp.getName()+" | "+tmp.getAddr());	
			 
		}
		System.out.println("----------------------------------------");
		List<FriendDto> list1 = new FriendDao().getList();
		for(FriendDto tmp : list1) {
			System.out.println(tmp.getNum()+" | "+tmp.getName()+" | "+tmp.getPhone()+"|"+tmp.getBirth());	
		}
	}
}
