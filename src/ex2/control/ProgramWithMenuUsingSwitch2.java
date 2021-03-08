package ex2.control;

import java.util.Scanner;

public class ProgramWithMenuUsingSwitch2 {
	public static void main(String[] args) {

		int kor, eng, math, total;
		double avg;
		kor = 0;
		eng = 0;
		math = 0;

		Boolean more = true;
		Scanner scan = new Scanner(System.in);

		EXIT: while (more) {
			// 메뉴를 왜 앞에 선언하는가?
			int menu;
			System.out.println("┌────────────────────┐");
			System.out.println("│      　메인 메뉴      │");
			System.out.println("└────────────────────┘");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 종료");
			System.out.print("> ");
			menu = Integer.parseInt(scan.nextLine());

			switch (menu) {
			// menu의 값이 1이라면
			case 1:
				System.out.println("┌────────────────────┐");
				System.out.println("│      　성적 입력      │");
				System.out.println("└────────────────────┘");


				/*
				 * kor의 값이 유효범위 내에 있지 않다면 입력범위 0~100 범위의 값만 입력할 수 있습니다 댜시 국어 성적을 입력받는다
				 */
				do {
					System.out.println("입력 범위 0~100 값만 입력할 수 있습니다");
					System.out.printf("국어 : ");
					kor = Integer.parseInt(scan.nextLine());
				} while (kor < 0 || kor > 100);

				System.out.printf("영어 : ");
				eng = Integer.parseInt(scan.nextLine());
				System.out.printf("수학 : ");
				math = Integer.parseInt(scan.nextLine());
				break;

			// menu의 값이 2이라면
			case 2:
				// total이랑 avg는 상단부에 미리 정의하면 안 되는가?
				total = kor + eng + math;
				avg = total / 3.0f;

				System.out.println("┌────────────────────┐");
				System.out.println("│      　성적 출력      │");
				System.out.println("└────────────────────┘");

				for(int i=0; i<3; i++) {
				System.out.printf("국어 : %d\n", kor);
				System.out.printf("영어 : %d\n", eng);
				System.out.printf("수학 : %d\n", math);

				System.out.printf("총점 : %2d\n", total);
				System.out.printf("평균 : %26.2f\n", avg);
				}
//				System.out.print("계속할까요? (true/false)");
//				more = scan.nextBoolean();
				break;

			case 3:
				more = false;
				break EXIT;
			}
			System.out.println("Bye~~");

		}
	}
}
