package homework;

import java.util.Scanner;

public class homework_0315 {

	public static void main(String[] args) {

		/// 구구단 2차원 배열 생성
		int[][] multiple = new int[10][10];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				multiple[i][j] = i*j;

		/// 구구단 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("공백으로 구분한 1에서 9 사이의 두 정수를 입력하세요");
		String number = scan.nextLine();
		String[] numbers = number.split(" ");
		int numberOne = Integer.parseInt(numbers[0]);
		int numberTwo = Integer.parseInt(numbers[1]);
		
		//결과 출력
		System.out.printf("%d와 %d의 곱은 %d입니다", numberOne, numberTwo, multiple[numberOne][numberTwo]);
		scan.close();

	}
}
