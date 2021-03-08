package homework;

import java.util.Scanner;

public class homework_0308 {
	public static void main(String[] args) {
		/*
		 * Mission : 국어, 영어, 수학 점수를 입력받아 0~100사이가 아닐 경우 다시 입력 받고, 이상 없을 시 각각 합계, 평균을 출력하도록 코드를 작성시오.
		 * 조건: 국어, 영어, 수학의 점수가 0부터 100사이의 정수가 아닐 때 다시 입력 받으시오. 반복문은 총 한 번만 사용하시오.
		 */
		int kor, eng, math, total;
		double avg;
		kor = 0;
		eng = 0;
		math = 0;

		Scanner scan = new Scanner(System.in);

				System.out.println("┌────────────────────┐");
				System.out.println("│      　성적 입력      │");
				System.out.println("└────────────────────┘");


				//kor의 값이 유효범위 내에 있지 않다면 입력범위 0~100 범위의 값만 입력할 수 있습니다 댜시 국어 성적을 입력받는다
				System.out.printf("국어 : ");
				kor = Integer.parseInt(scan.nextLine());
				System.out.printf("영어 : ");
				eng = Integer.parseInt(scan.nextLine());
				System.out.printf("수학 : ");
				math = Integer.parseInt(scan.nextLine());

				boolean korR = kor < 0 || kor > 100;
				boolean engR = eng < 0 || eng > 100;
				boolean mathR = math < 0 || math > 100;
				
				while(korR || engR || mathR) {
					if(korR) {
						System.out.println("입력 범위 0~100 값만 입력할 수 있습니다");
						System.out.printf("국어 : ");
						kor = Integer.parseInt(scan.nextLine());
						korR = kor < 0 || kor > 100;}//다시 계산해서 알려 줘야 됨 
					
					else if(engR) {
						System.out.println("입력 범위 0~100 값만 입력할 수 있습니다");
						System.out.printf("영어 : ");
						eng = Integer.parseInt(scan.nextLine());
						engR = eng < 0 || eng > 100;}
	
					
				
					else if(mathR){
						System.out.println("입력 범위 0~100 값만 입력할 수 있습니다");
						System.out.printf("수학 : ");
						math = Integer.parseInt(scan.nextLine());
						mathR = math < 0 || math > 100;}
					
					else break;
				}
				
	
				total = kor + eng + math;
				avg = total / 3.0f;

				System.out.println("┌────────────────────┐");
				System.out.println("│      　성적 출력      │");
				System.out.println("└────────────────────┘");

					System.out.printf("국어 : %d\n", kor);
					System.out.printf("영어 : %d\n", eng);
					System.out.printf("수학 : %d\n", math);

					System.out.printf("총점 : %2d\n", total);
					System.out.printf("평균 : %26.2f\n", avg);
				

		
		
	}
}
