package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass02 {
	public static void main(String[] args) {
		
		//ArrayList 객체를 생성해서 List 인터페이스 type 지역 변수에 참조 값 담기
		List<String> names = new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주댕이");
		names.add("덩어리");
		
		//반목문 돌면서 친구 이름을 순서대로 콘솔 창에 출력해보기
		//for문과 확장 for문은 무조건 알고 가기
		for(int i=0; i<names.size(); i++) {
			String tmp = names.get(i);
			System.out.println(tmp);
		}
		System.out.println("------확장 for문 활용------");
		for(String tmp1 : names) {
			System.out.println(tmp1);
		}
		
		System.out.println("------forEach() 메소드 활용------");
		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		names.forEach(con);
		
		System.out.println("------forEach() 메소드 활용2------");
		Consumer<String> con2 = (t1) -> {
			System.out.println(t1);
		};
		
		names.forEach(con2);
		
		System.out.println("-----forEach() 메소드 축약-----");
		names.forEach((t) -> {
			System.out.println(t);
		});
	}
}
