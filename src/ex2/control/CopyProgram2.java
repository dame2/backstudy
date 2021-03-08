package ex2.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram2 {

	public static void main(String[] args) throws IOException {
		// 1. res/img.bmp 파일을 읽기 위한 FileInputStream 객체 fis를 생성하고
		//		res/img_copy.bmp 파일로 쓰기 위한 FileOutputStream 객체 fos를 생성한다.
		FileInputStream fis = new FileInputStream("res/img.bmp");
		FileOutputStream fos = new FileOutputStream("res/img_copy.bmp");
		
		// 2. fis를 통해서 1 바이트를 읽어서 byte 변수 b에 담는다.
		// 		b의 값을 fos를 통해서 출력한다.
//		int b = 0;
//		while ((b = fis.read()) != -1)
//				fos.write(b);
		
		int b = 0;
		do {
			b = fis.read();
			if(fis.read() != -1) {
				fos.write(b);
			}
		}while(fis.read() != -1);
		
		/*if문 vs while문
		if의 조건문 검사 -> 종속문자 실행 -> 다음 문자 
		while의 조건문 검사 -> 종속문장 실행 -> while 조건문 검사*/
		
		// 4. 모든 스트림 객체를 닫는다.
		fis.close();
		fos.close();
	}

}
