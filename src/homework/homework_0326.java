package homework;

import ex6.capsule.lotto.Object.Constructor.Lotto;
import ex6.capsule.lotto.Object.Constructor.LottoConsole;

public class homework_0326 {
	public static void main(String[] args) {
		// lotto 객체 생성
		Lotto lotto = new Lotto();
		lotto.gen();
		
		// 로또 출력하고
		LottoConsole.print(lotto);
		System.out.println();

		// 로또 오름차 정렬하고 출력하
//		Lotto.sort(lotto);
		lotto.ascending();
		System.out.println("-----오름차순 sort-----");
		LottoConsole.print(lotto);
		// 로또 내림차 정렬하고 출력하
		lotto.descending();
		System.out.println("-----내림차순 sort-----");
		LottoConsole.print(lotto);
	}

}
