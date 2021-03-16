package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program4MultiArray {

	public static void main(String[] args) throws IOException {
		String[][] rows;
		int count;

		// 레코드 개수를 알아내는 코드
		{
			FileInputStream fis = new FileInputStream("res/covid19.csv");
			Scanner fscan = new Scanner(fis);

			fscan.nextLine();

			count = 0;
			// while문으로 반복하면서 count++ 연산을 한다. 마지막 줄을 만날 때까지.
			while (fscan.hasNext()) {
				count++;
				fscan.nextLine();
			}
			fscan.close();
			fis.close();
		}

		// 레코드를 로드하는 코드
		{
			FileInputStream fis;
			Scanner fscan;
			String line;

			rows = new String[count][];
			fis = new FileInputStream("res/covid19.csv");
			fscan = new Scanner(fis);

			fscan.nextLine();

			for (int j = 0; j < count; j++) {
				line = fscan.nextLine();
				rows[j] = line.split(","); // 왜 1차원 배열로 받는지 기존 count값을 넣은 2차원 배열은 어떻게 되는
			}
			fscan.close();
			fis.close();
		}

		// 레코드를 출력하는 코드
		for (int j = 0; j < count; j++) {
			for (int i = 0; i < 10; i++) { // split한 rows 값이 어떻게 여기에 들어가는지
				System.out.print(rows[j][i]);
				if (i < 10 - 1)
					System.out.print(",");
			}
			System.out.println();
		}

		// 검사진행자 누적수를 얻는 코드
		{
			int total;

			total = 0;

			for (int j = 0; j < count; j++)
				total += Integer.parseInt(rows[j][3]);
			System.out.println(total);
		}

		// 일 가장 많은 검사진행수는?
		// 그 max의 날짜[i][0]는?
		int max = 0;
		String date = "";
		int idx = 0;
		int current;

		for (int i = 0; i < count; i++) {
			current = Integer.parseInt(rows[i][3]);
			if (current > max) {
				max = current;
				idx = i;
				date = rows[idx][0];
			}
		}

		System.out.printf("일별 가장 많은 검사 진행자수: %d", max);
		System.out.println();
		System.out.printf("그날: %s", date);
		System.out.println();

		// 확진자 수가 늘어난 일자와 수를 출력하시오.
		int diff = 0;
		current = Integer.parseInt(rows[0][1]);
		
		for (int i = 1; i < count; i++) {
			int next = Integer.parseInt(rows[i][1]);
			
			if (next != current) {
				diff = next - current;
				date = rows[i][0];
				current = next;
				System.out.printf("%d: %s, %d\n", i+1, date, diff);
			}

		} 
		
	}
}
