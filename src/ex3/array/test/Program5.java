package ex3.array.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("res/covid19.csv");
		Scanner scan = new Scanner(fis);
	
		// 값변수 value type : 기본 형식, 담는 공간을 가지는 변
		// 참조변수 ref type : 기본 형식이 아닌 경우, 담을 공간이 없으며 객체(*)를 가리키기 위한 변수 식별하다=참조하다,
		// 식별자=참조변수
		// 즉, String의 객체가 공간,String s = "hello"; = new String("hello");

		String line = scan.nextLine();
		String[] title = line.split(",");
		int total = 0;

		// 4번째 데이터를 얻어서 정수로 변환
		while (scan.hasNextLine()) {
				line = scan.nextLine();
				String[] result = line.split(",");
				total += Integer.parseInt(result[3]);
			
		}
		System.out.printf("%s: %d", title[3], total);

		scan.close();

		// 10월 1일부터 12월 14일까지의 누적 검사진행자수: 32123
	}

}
