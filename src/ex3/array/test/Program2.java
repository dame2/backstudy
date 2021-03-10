package ex3.array.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		// 1. 문자열 10개짜리 names 배열을 생성한다.
		String[] names = new String[10];
		// 2. 파일에서 name들을 읽어와서 names 배열에 대입한다.
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner fscan = new Scanner(fis);
		
		int j=0;
		while(fscan.hasNextLine()) {
			String name = fscan.nextLine();
			names[j++] = name;
		}
		
		fscan.close();
		fis.close();
		
		// 3. names 배열의 이름을 다음처럼 출력한다.
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s", names[i]);
			if (i < names.length)
				System.out.printf(", ");
		}
	}
}
