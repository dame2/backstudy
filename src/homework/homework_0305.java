package homework;

import java.util.Scanner;

public class homework_0305 {
	public static void main(String[] args) {
		/*
		 * Mission -초기 정수값을 입력하고 해당 정수에 대한 소인수 공부 코드를 작성한다 -초기 정수값이 소수인지 판별하는 메소드를 구현하여
		 * 소수라면 "다시 작성해 달라"고 요청한다 -새 입력값이 소인수가 맞으면 “x는 y의 소인수가 맞다”고 출력하고 소인수가 아니라면
		 * “아니라”고 출력한다 -계속할지 물어보고 그렇다고 하면 반복한다 -while문과 if문을 이용한다
		 */
		Scanner scan = new Scanner(System.in);
		boolean yes = true;
		String ans;

		// 대상 정수값 입력
		System.out.print("정수값을 입력하세요:");
		int x = scan.nextInt();

		if (isPrimeNumber(x) == true)
			System.out.print("올바른 값을 다시 입력하세요:");

		// 소인수 입력
		while (yes) {
			System.out.print("소인수를 입력하세요: ");
			int y = scan.nextInt();
			if ((x % y) == 0 && isPrimeNumber(y) == true)
				System.out.printf("%d는 %d의 소인수가 맞습니다\n", y, x);
			else if ((x % y) != 0)
				System.out.printf("%d는 %d의 소인수가 아닙니다\n", y, x);

			System.out.println("계속하려면 \"네\"를 입력하세요: ");
			scan.nextLine();// 입력값 타입이 다르면 쓸어줌?
			ans = scan.nextLine(); // 네를 입력할 기회를 안 줌
			if (ans.equals("네")) // string 전용 비교 메소드
				yes = true;
			else
				yes = false;

		}
		scan.close();
	}

	public static boolean isPrimeNumber(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true; // 소수라면 true 리턴
	}
}
