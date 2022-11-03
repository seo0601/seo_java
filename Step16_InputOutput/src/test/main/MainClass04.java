package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		// 콘솔 창과 연결된 객체의 참조 값
		PrintStream ps = System.out;
		ps.println("???"); // >> System.out.println();와 같다
		
		//학습을 위해서 PrintStream 객체를 부모 type인 OutputStream으로 받아보기
		//OutputStream도 1byte 처리 스트림이다.(한글 처리 불가)
		OutputStream os = ps;
		try {
			os.write(97);
			os.write(98);
			os.write(99);
			os.write(44032); // 1byte이므로 256이 최대고 한글 처리도 안된다.
			os.flush(); // 방출을 해야 콘솔 창에 출력이 된다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
