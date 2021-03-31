package ex7.상속;

import java.awt.Frame;

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
		
		//lotto를 출력하는 객체(x)는 아니고 print
		//LottoConsole.print(lotto);
		
	}

}
