package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass09 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주댕이");
		names.add("덩어리");
		
		//반복자(Iterator) 객체를 얻어내기(저장된 item을 일렬로 세웠다고 생각하면 됨)
		Iterator<String> it = names.iterator();
		
		//cursor 다음에 item이 있는 동안에만 반복물을 돌면서
		while(it.hasNext()) { //hasNext()는 다음에 가져올 값이 있으면 true, 없으면 false, boolean type
			//cursor를 다음 칸으로 이동해서 cursor가 위치한 곳의 item을 읽어오기
			String item = it.next(); //next()는 iterator의 다음 요소 값 반환, 아무 타입 가능
			System.out.println(item);
		}
		//특정 item(데이터, 참조값) 존재 여부 알아내기
		boolean isContain = names.contains("김구라");
		//저장된 item의 갯수
		int size = names.size();
		//특정 item 삭제
		names.remove("해골");
		//모든 item 삭제
		names.clear();
		
	}
}
