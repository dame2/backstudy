package ex2.control;

import java.util.Scanner;

public class ProgramWithMenu {
	public static void main(String[] args) {

		int kor, eng, math, total;
		double avg;
		kor = 0;
		eng = 0;
		math = 0;
	

		Boolean more = true;
		Scanner scan = new Scanner(System.in);

		while (more) {
			//메뉴를 왜 앞에 선언하는가?
			int menu;
			System.out.println("┌────────────────────┐");
			System.out.println("│      　메인 메뉴      │");
			System.out.println("└────────────────────┘");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 종료");
			System.out.print("> ");
			menu = Integer.parseInt(scan.nextLine());
			
			
			//menu의 값이 1이라면 
			if (menu == 1) {

				System.out.println("┌────────────────────┐");
				System.out.println("│      　성적 입력      │");
				System.out.println("└────────────────────┘");

				System.out.printf("국어 : ");
				kor = Integer.parseInt(scan.nextLine());
				System.out.printf("영어 : ");
				eng = Integer.parseInt(scan.nextLine());
				System.out.printf("수학 : ");
				math = Integer.parseInt(scan.nextLine());

			}

			//menu의 값이 2이라면 
			else if (menu == 2) {
				//total이랑 avg는 상단부에 미리 정의하면 안 되는가?
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

			}
			else
				more = false;
		}
		scan.close();
		System.out.println("Bye~~");

	}
}
