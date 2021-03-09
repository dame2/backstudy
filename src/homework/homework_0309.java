package homework;

import java.util.Scanner;

public class homework_0309 {
	public static void main(String[] args) {
		//과목 수 +1만큼의 크기를 갖는 배열을 만들어
		//각 과목의 성적을 입력하고 총합을 배열에 입력해주세요.
		//그리고 각 과목 성적, 총합, 평균을 출력해주세요.

		int[] score = new int[4];
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("국어 성적 입력: ");
		score[0] = scan.nextInt();
		System.out.printf("수학 성적 입력: ");
		score[1] = scan.nextInt();
		System.out.printf("영어 성적 입력: ");
		score[2] = scan.nextInt();
		score[3] = score[0]+score[1]+score[2];
		
		float avg = score[3]/3.0f;
		
		System.out.printf("국어: %d\n", score[0]);
		System.out.printf("수학: %d\n", score[1]);
		System.out.printf("영어: %d\n", score[2]);
		System.out.printf("평균: %d\n", score[3]);
		System.out.printf("총합: %f", avg);
		
		scan.close();
	}
}
