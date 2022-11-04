package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass15 {
	public static void main(String[] args) {
		//필요한 참조 값을 담을 지역 변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//파일에서 byte를 읽어낼 객체
			fis = new FileInputStream("c:/acorn202210/myFolder/bottle.png");
			//파일에 byte를 출력할 객체
			fos = new FileOutputStream("c:/acorn202210/myFolder/copied.png");
			while(true) {
				//byte 알갱이 하나씩 읽어들인다. 파일이 큰 경우 하나씩 읽어들이면 너무 오래 걸린다. 
				int data = fis.read();
				//만약에 읽을 byte가 없다면 (보통 -1로 사용한다.)
				if(data == -1) {
					break; //반복문 탈출
				}
				System.out.println(data);
				//읽은 byte 알갱이 하나를 출력하기
				fos.write(data);
				fos.flush();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			}catch(Exception e) {}
		}	
			
	}
}
