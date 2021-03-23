package homework;

import java.util.Random;

public class homework_0323 {

	public static void main(String[] args) {

		int[] lotto;
		// 로또 만들고
		lotto = gen();
		// 로또 출력하고
		print(lotto);
		// 로또 정렬하고
		sort(lotto);
		// 로또 출력하자
		print(lotto);
	}

	private static void sort(int[] lotto) {
		for (int i = 0; i < lotto.length - 1; i++)
			if (lotto[i] > lotto[i + 1]) {
				int temp = lotto[i];
				lotto[i] = lotto[i + 1];
				lotto[i + 1] = temp;
			}
	}

	private static void print(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%d", lotto[i]);
			if (i < lotto.length-1)
				System.out.printf(",");
			else
				System.out.println();
		}

	}

	private static int[] gen() {
		Random rand = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++) {
			int lot = rand.nextInt(45);
			lotto[i] = lot;
		}
		return lotto;
	}

}
