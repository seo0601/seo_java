package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// 1. String type을 담을 수 있는 방 3개짜리 빈 배열 객체를 만들어서 참조 값을 지역변수 names에 담기
		String[] names = new String[3];		
		// String[] names = new String{null,null,null}; 
		
		// 2. 3개의 방에 순서대로 친구의 이름을 담아 보세요
		names[0] = "김구라";
		names[1] = "원숭이";
		names[2] = "해골";
		
		// 3. 배열에 들어 있는 친구의 이름을 하나씩 순서대로 콘솔 창에 출력해 보세요.
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
