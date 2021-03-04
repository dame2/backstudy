package ex1.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class program {

	public static void main(String[] args) throws IOException {

		// 1. 이미지 파일을 읽기 위한 파일입력스트림을 fis로 생성주시오.
		FileInputStream fis = new FileInputStream("res/img.bmp");
		// 2. 1바이트가 정수형으로 읽어오는 것, 끝까 지 읽었으면 -1 반환

		// 초반 2 바이트를 버리는 이유? signiture
		// FileSize 8바이트부터 읽는
		int b;
		b = fis.read();
		b = fis.read();
		
		// fileSize
		int b1 = fis.read();
		int b2 = fis.read();
		int b3 = fis.read();
		int b4 = fis.read();

		int fileSize = 0; // [b1][b2][b3][b4];
		fileSize = b1; // [][][][b1];
		fileSize = b2; // [][][][b2];
		fileSize = b3; // [][][][b3];
		fileSize = b4; // [][][][b4];

		// 0x000000 24bit

		// 16진수: 0x20
		// 10진수: 23
		// 8진수: 023
		// 2진수: 0b10

		// 이진수 0b00001111 0111
		// 0~9ABCDEF
		// 2진수 -> 1비트
		// 4진수 -> 2비트
		// 8진수 -> 3비트
		// 16진수 -> 4비트

		// b3&000000ff=[][][][]b3]
		// [b4][b3][b2][b1]
		fileSize = 	(b4 & 0x000000ff) << 8 * 3 | // [b4][][][]
					(b3 & 0x000000ff) << 8 * 2 | // [b4][b3][][]
					(b2 & 0x000000ff) << 8 * 1 | // [b4][b3][b2][]
					(b1 & 0x000000ff);

		System.out.println(Integer.toBinaryString(b4));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b1));
		System.out.printf("fileSize: %d\n", fileSize);
		
		fis.close();
	}
}
