package ex7.상속.Is_a;

public class LottoConsole {

	// Has A 상속
	// 객체가 다른 객체를 자신의 멤버 Has하고 그것을 이용하면 그것을 Has A 상속이라고 한
	private Lotto lotto; // "Has하다"

	// 1. Composition Has A 상속 = 일체형, 구성 관계, 생성자 안에 생성
	public LottoConsole() {
		lotto = new Lotto();
	}

	// 2. Association Has A 상속 = 분리형, 매개변수로 받아서 생성
	public LottoConsole(Lotto lotto) {
		this.lotto = lotto;
	}

	public void print() {
		for (int i = 0; i < /* lotto.getSize(lotto) */ lotto.getSize(); i++) {
			System.out.printf("[%d]", lotto.getNum(i));
		}
		System.out.println();
	}
}
