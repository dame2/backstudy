package homework;

import java.util.Scanner;

public class homework_0320 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String stCount = new String();
		int[] count = new int[10];
		Numbers Num = new Numbers();
		String[] numbers = new String[10];

		int j = 0;
		while (j < 10) {
			System.out.printf("1부터 9까지의 숫자를 입력하세요: ");
			char input = scan.next().charAt(0);
				while(Character.isDigit(input) == false) {
					System.out.print("숫자를 입력하세요: ");
					input = scan.next().charAt(0);
					}
			
			int intInput = Character.getNumericValue(input);
				while (intInput > 10 || intInput < 1) {
					System.out.printf("다시 입력하세요: ");
					input = scan.next().charAt(0);
					intInput = Character.getNumericValue(input);
				}

			for (int i = 1; i < 10; i++) {
				if (intInput == i) {
					count[i]++;

					stCount = Integer.toString(count[i]);
					numbers[i] = stCount;

					Num.sum += intInput;
					Num.numbers = numbers;
				}
			}
			j++;

		}
		scan.close();
		for (int i = 1; i < 10; i++) 
			System.out.printf("%s, %s\n", i, Num.numbers[i] == null ? 0 : Num.numbers[i]);
		System.out.printf("합계: %d", Num.sum);

	}

}
