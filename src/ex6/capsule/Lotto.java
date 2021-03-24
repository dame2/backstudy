package ex6.capsule;

import java.util.Random;

public class Lotto {

	public static void sort(int[] lotto) {
		for(int j=0;j<lotto.length;j++)
		for (int i = 0; i < lotto.length - 1; i++)
			if (lotto[i] > lotto[i + 1]) {
				int temp = lotto[i];
				lotto[i] = lotto[i + 1];
				lotto[i + 1] = temp;
			}
	}
	
	public static int[] gen() {
		Random rand = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++) {
			int lot = rand.nextInt(45);
			lotto[i] = lot;
		}
		return lotto;
	}
}
