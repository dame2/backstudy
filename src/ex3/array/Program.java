package ex3.array;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// Ramdom 객체를 rand라는 이름으로 생성
		Random rand = new Random();
		System.out.println(rand.nextInt(45)+1);
		// 1. kors라는 이름의 정수 6개짜리 배열을 생성해 주시오.
		int[] kors = new int[6];
		
		for(int i=0; i<6; i++)
			kors[i]=rand.nextInt(i)+1;
		
		
		for(int i=0; i<6; i++)
			System.out.printf("%d",  kors[0]);
		
		
	}

}
