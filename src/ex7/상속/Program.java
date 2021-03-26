package ex7.상속;

import ex6.capsule.lotto.Object.Lotto;
import ex6.capsule.lotto.Object.LottoConsole;

public class Program {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.init();
		lotto.gen();
		LottoConsole.print(lotto);
	}

}
