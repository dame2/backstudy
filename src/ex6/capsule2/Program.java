package ex6.capsule2;

import java.util.Random;

public class Program {
	public static void main(String[] args) {
		Lotto lotto;
//		int[] lotto;
		// 로또 만들고
		lotto = gen();
		// 로또 출력하고
		print(lotto);
		
		System.out.println();
		System.out.println("-----after sort-----");
		
		// 로또정렬하고
		Lotto.sort(lotto);
		// 로또 출력하자
		print(lotto);

	}
	private static void print(Lotto lotto) {
		for (int i = 0; i < 6; i++) {
			System.out.printf("[%d]", lotto.nums[i]);
		}
		
	}

	public static Lotto gen() {
		//개체 생성
		Lotto lotto = new Lotto();
		//객체 생성
		lotto.nums = new int[6];
		
		Random rand = new Random();
	
		for (int i=0; i<6; i++) {
			lotto.nums[i] = rand.nextInt(45)+i;
			//자판기, 블랙박스
		}
		return lotto;
	}

}
