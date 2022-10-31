package test.main;

import java.util.ArrayList;

/*
 *	Java에서 배열은 크기를 조절할 수 없는 고정 배열이다.
 *
 *	따라서 동적으로 item을 추가하고 삭제하는 작업을 하려면 일반 배열은 사용할 수 없다.
 *
 *	그래서 해당 작업을 하려면 ArrayList 객체를 사용하면 된다.
 */

public class MainClass01 {
	public static void main(String[] args) {
		
		// String type을 저장할 수 있는 ArrayList 객체 생성
		ArrayList<String> names = new ArrayList<>();
		
		//김구라, 해골, 원숭이 3개의 String type 저장하기
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		//0번 방 아이템을 불러와서 item이라는 변수에 담기
		String item = names.get(0);
		
		//1번 방의 아이템을 삭제하려면?
		names.remove(1);
		
		//0번 방에 에이콘을 넣고 싶으면?
		names.add(0, "에이콘");
		
		//저장된 아이템의 갯수를 size라는 지역 변수에 담아보기
		int size = names.size();
		
		//저장된 모든 아이템 삭제
		names.clear();
	}
}
