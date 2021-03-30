package ex7.상속;

/*
 * 상속:
 * Has A 상속
 * Is A 상속
 */
public class Program {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.gen();
		LottoConsole console = new LottoConsole();
		console.print();
	}

}
