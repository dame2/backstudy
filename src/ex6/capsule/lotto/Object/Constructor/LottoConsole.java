package ex6.capsule.lotto.Object.Constructor;

public class LottoConsole {
	public static void print(Lotto lotto) {
		for (int i = 0; i < lotto.getSize(); i++) {
			System.out.printf("[%d]",lotto.getNum(i));
		}
		System.out.println();
	}
}
