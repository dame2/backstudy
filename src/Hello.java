/*int code = System.in.read(); 아스키 코드를 불러들이는 입력 함수
- tip!!! alt 누르고 앞뒤로 이동하기
Scanner 사용 전 1. new 명령어로 개체 만들기, 스캐너 이름 지어주기, 임포트하기
Scanner scan = new Scanner(System.in);
사용: String line = scan.nextLine(), scan.next(), scan.nextInt(), scan.nextFloat(), scan.nextDouble()
window) 파일 경로 지정할 때 역슬래쉬 두 번*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

class Hello {
	public static void main(String[] args) throws IOException{
		int kor, eng, math, total;
		double avg;
		kor = 0;
		eng = 0;
		math = 0;
		
		//파일 입력
		//1. 파일 입력 스트림 객체를 fis라는 이름으로 만들어야 해~
		FileInputStream fis = new FileInputStream("/Users/nevermind/Desktop/newlec/workspace/javaprj/data.txt");
		//2. fis를 Scanner로 포장해서 사용해 봐~
		Scanner scan1 = new Scanner(fis);
		kor = scan1.nextInt();
		eng = scan1.nextInt();
		math = scan1.nextInt();
		//3. 스캔 닫고 파일 닫기
		scan1.close();
		fis.close();
		
		//파일 출력
		//1. 파일 출력 스트림 객체를 fos라는 이름으로 만들어야 돼~
		FileOutputStream fos = new FileOutputStream("/Users/nevermind/Desktop/newlec/workspace/javaprj/data.txt");
		//2.fos를 PrintStream으로 포장해서 사용해 봐~
		PrintStream fout = new PrintStream(fos);
		kor = kor + 1;
		eng = eng + 1;
		
		fout.printf("%d %d %d", kor, eng, math);
		//3. 객체 닫고 파일 닫기
		fout.close();
		fos.close();
		
		//성적 입력 코드
		
		/*Scanner scan = new Scanner(System.in);
		System.out.print("국어 성적을 입력하세요: ");
		kor = scan.nextInt();
		System.out.print("수학 성적을 입력하세요: ");
		math = scan.nextInt();
		System.out.print("영어 성적을 입력하세요: ");
		eng = scan.nextInt();*/

		total = kor + eng + math;
		avg = total / 3.0;

		System.out.println("┌────────────────────────────┐");
		System.out.println("│          성적 출력           │");
		System.out.println("└────────────────────────────┘");

		System.out.printf("국어 1: %d\n", kor);
		System.out.printf("수학 1: %d\n", math);
		System.out.printf("영어 1: %d\n", eng);

		System.out.printf("총점: %d\n", total);
		System.out.printf("평균: %4.2f\n", avg);

		/* read() 함수는 ASCII 문자열로 인식
		 * int code = System.in.read();
		 * System.out.printf("code is %d\n", code);
		 * System.out.printf("code is %c\n", code);
		 * 
		 * int code2 = System.in.read();
		 * System.out.printf("code is %d\n", code2);
		 * System.out.printf("code is %c\n", code2);
		 */
	}
}



