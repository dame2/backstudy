package ex3.array;

public class Program2 {

	public static void main(String[] args) {
		// 반복문을 사용하는 것에 초점을 두고 연습

		// 1. 문자 10개를 저장하기 위한 문자배열 chs를 만드시오
		char[] chs = new char[10];

		// 2. chs 배열에 문자 'A'를 모두 채우시오
		for (int i = 0; i < 10; i++)
			chs[i] = 'A';

		// 3. chs 배열에 담겨진 문자들을 모두 출력하시오. A A A A
		for (int i = 0; i < 10; i++)
			System.out.printf("%c ", chs[i]);
		System.out.println();

		// J부터 A까지를 채우는 코드르 작성하시오.
		for (int i = 0; i < 10; i++) {
			chs[i] = (char) ('A' + 9 - i);
			System.out.printf("%c ", chs[i]);}
		
		System.out.println();
		
		// A와 Z의 자리를 바꾸자.
		// swap
		for (int i=0; i<5; i++) {
			char temp;
			temp = chs[i];
			chs[i] = chs[9-i];
			chs[9-i] = temp;
		}
		
		// 배열에 담겨진 값을 출력하는 코드를 작성하시오.
		for (int i = 0; i < 10; i++) 
			System.out.printf("%c ", chs[i]);
		
		
	}
}
