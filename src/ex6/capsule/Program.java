package ex6.capsule;

public class Program {
	private static void print(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		}

	}

	public static void main(String[] args) {
		
		int[] lotto;
		// 로또 만들고
		lotto = Lotto.gen();
		// 로또 출력하고
		print(lotto);
		
		System.out.println();
		System.out.println("-----after sort-----");
		
		// 로또 정렬하고
		Lotto.sort(lotto);
		// 로또 출력하자
		print(lotto);

	}

}
