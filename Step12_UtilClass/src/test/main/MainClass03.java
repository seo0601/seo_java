package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		// 정수를 저장할 수 있는 ArrayList 객체를 생성해서 참조 값을 List 인터페이스 type의 지역 변수 nums에 담기
		// ArrayList type은 기본 데이터 type으로 받지 못한다.
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		for(Integer tmp : nums) {
			System.out.println(tmp);
		}
		System.out.println("------------");
		nums.forEach((item) -> {
			System.out.println(item);
		});
	}
	
}
