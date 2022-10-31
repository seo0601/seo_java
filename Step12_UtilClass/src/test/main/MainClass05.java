package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		// 1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조 값을 members라는 지역 변수에 담기
		ArrayList<Member> members = new ArrayList();
		
		// 2. 3명의 회원 정보를 Member 객체에 각각 담아 보세요. (Member 객체가 3개 생성되어야 함)
		Member mem1 = new Member(1,"김구라","노량진");
		Member mem2 = new Member(2,"해골","행신동");
		Member mem3 = new Member(3,"서동민","중안동");
		
		// 3. 위에서 생성된 Member 객체의 참조 값을 members List 객체에 모두 담아보세요
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
		
		/*
		 * 4. member List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로 반복문을 이용해 출력해 보세요
		 * 	  
		 * 	  번호: 1, 이름: 김구리, 주소 : 노량진
		 */
		for(int i=0; i<members.size(); i++) {
			Member tmp = members.get(i);
			System.out.println("번호:" + tmp.num + ", 이름: " + tmp.name + ", 주소: " + tmp.addr);		
		}
	}
}
