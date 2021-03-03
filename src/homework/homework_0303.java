package homework;

/* Mission
- 'score.txt'라는 텍스트 파일을 읽어서 변수 a, b, c, d, e에 입력한다.
- 'score.txt'의 내용은 다음과 같다. [37 62 98 100 50]
- a, b를 비트합집합으로 연산하여 변수 x에 저장한다.
- c, d를 비트교집합으로 연산하여 변수 y에 저장한다.
- 정수 x + y를 연산하여 z에 저장한다.
- 변수 z의 값을 'score.txt'에 저장한다.
- 사용된 모든 입출력은 최종적으로 닫혀 있어야 한다.*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class homework_0303 {
	public static void main(String[] args) throws IOException {
		
		//파일 입력 
		FileInputStream fis = new FileInputStream("/Users/nevermind/Desktop/newlec/workspace/javaprj/src/homework/score.txt");
		int a, b, c, d, e;
		
		Scanner scan1 = new Scanner(fis);
		a = scan1.nextInt();
		b = scan1.nextInt();
		c = scan1.nextInt();
		d = scan1.nextInt();
		e = scan1.nextInt();
		
		
		int x = a | b;
		int y = c & d;
		int z = x + y;
		
		scan1.close();
		fis.close();
		
		//파일 출
		FileOutputStream fos = new FileOutputStream("/Users/nevermind/Desktop/newlec/workspace/javaprj/src/homework/score.txt");
		PrintStream fout = new PrintStream(fos);
		
		fout.printf("%d", z);
		System.out.printf("a: %d\nb: %d\nc: %d\nd: %d\ne: %d\n", a, b, c, d, e);
		
		
		fout.close();
		fos.close();
		
	
	}

}
