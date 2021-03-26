package ex6.capsule.lotto;

public class Program {
	public static void main(String[] args) {
		//lotto 객체 생성
		Lotto lotto = new Lotto(); // 4 byte[ ] 이름뿐
		//lotto 생성 후 반드시 "초기화" 함수 생성
		//lotto.nums = new int[6]; // 24 byte [  ] 공간 마련
		Lotto.init(lotto);
		//Object Oriented Programmming
		//객체로부터 출발하는 프로그래밍
		// 로또 만들고
		lotto = Lotto.gen(lotto); //Lotto의 인스턴스(객체, 실체)를 만드는 함수
		//lotto.gen();
		// 로또 출력하고	
		print(lotto);
		//lotto.print();
		
		System.out.println();
		System.out.println("-----after sort-----");
		
		// 로또정렬하고
		Lotto.sort(lotto);
		//lotto.sort
		// 로또 출력하자
		print(lotto);
		//lotto.print();
	}
	
	private static void print(Lotto lotto) {
		for (int i = 0; i < lotto.getSize(lotto); i++) {
			System.out.printf("[%d]", Lotto.getNums(lotto, i));
		}
		
	}
	

	
	
}
