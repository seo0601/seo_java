package test.main;
/*
 *  java에서 배열도 객체이다.
 *  즉, 배열은 참조 데이터 type이다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		
		// int type 5개를 저장하고 있는 배열 객체를 생성해서 참조 값을 nums 라는 지역 변수에 담기		
		int[] nums = {10, 20, 30, 40, 50};
		
		// double type 5개를 저장하고 잇는 배열
		double[] nums2 = {10.1, 10.2, 10.3, 10.4, 10.5};
		
		// boolean type 5개를 저장하고 있는 배열
		boolean[] truth = {true, false, true, false, true};
		
		// String type(참조 데이터 type) 5개를 저장하고 있는 배열
		String[] names = {"김구라", "해골", "원숭이", "주댕이", "덩어리"};
		
		//배열의 각각의 방 참조하기
		int result1 = nums[0]; //10
		double result2 = nums2[1]; //10.2
		boolean result3 = truth[2]; //true
		String result4 = names[3];  //주댕이
		
		
		// 배열 객체의 메소드와 필드 사용해 보기
		int[] cloned = nums.clone(); // 참조값은 다르지만 들어있는 내용은 같은 복제본이다.
		int[] copied = nums; // 참조값을 복사하기, 참조값(id)가 같다.
		int size = nums.length;
	}
}
