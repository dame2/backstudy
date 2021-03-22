package homework;

import java.util.Scanner;

public class homework_0322 {

	static String[][] make2dStringArray(int a, int b) {
		String[][] two = new String[a][b]; //heap
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				two[i][j] = "[" + (i + 1) + "][" + (j + 1) + "]";

		return two;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 행 몇 열의 2차원 배열을 만드시겠습니까?");
		int a = scan.nextInt();
		int b = scan.nextInt();
		String[][] realTwo= make2dStringArray(a,b);
		//두 번 호출되는 걸 피하기 위해 함수를 임의의 변수에 넣어 준
		
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				System.out.println(realTwo[i][j]);
		// 배열은 인덱스 번호를 써서 출력해야 
		scan.close();
	}

}
