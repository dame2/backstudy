package ex2.control;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		int kor, eng, math, total;
		double avg;
		kor = 0;
		eng = 0;
		math = 0;

		Boolean more = true;
		
		while(more) {
		
		// 성적을 입력하는 코드를 작성하시오.
		
		System.out.println("┌────────────────────┐");
		System.out.println("│      　성적 입력      │");
		System.out.println("└────────────────────┘");

		Scanner scan= new Scanner(System.in);

		System.out.printf("국어 : ");
		kor = Integer.parseInt(scan.nextLine());
		System.out.printf("영어 : ");
		eng = Integer.parseInt(scan.nextLine());
		System.out.printf("수학 : ");
		math = Integer.parseInt(scan.nextLine());

		total = kor + eng + math;
		avg = total / 3.0f;

		System.out.println("┌───────────────────────────────┐");
		System.out.println("│             성적 출력           │");
		System.out.println("└───────────────────────────────┘");

		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);

		System.out.printf("총점 : %2d\n", total);
		System.out.printf("평균 : %4.2f\n", avg);
		
		System.out.print("계속할까요? (true/false)");
		more = scan.nextBoolean();
		scan.close();
		}
		System.out.println("Bye~~");
		
	}
}
