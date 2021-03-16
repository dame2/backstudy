package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class homework_0316 {

	public static void main(String[] args) throws IOException {

		int count = 0;
		String[][] rows;
		{
			FileInputStream fis = new FileInputStream("res/covid19.csv");

			Scanner fscan = new Scanner(fis);
			fscan.nextLine();

			// count수 구하기
			while (fscan.hasNextLine()) {
				count++;
				fscan.nextLine(); // line에 담을 필요 없다
			}
			fscan.close();
			fis.close();
		}

		// 2차원 배열에 값 저장하기
		{
			FileInputStream fis = new FileInputStream("res/covid19.csv");
			Scanner fscan = new Scanner(fis);
			String line;
			
			fscan.nextLine();
			
			rows = new String[count][];
			for (int i = 0; i < count; i++) {
				line = fscan.nextLine();
				rows[i] = line.split(",");
			}
			fscan.close();
			fis.close();
		}
		
		// 확진자가 제일 많은 날을 출력하시오.
		int recent = Integer.parseInt(rows[0][1]);
		int diff = 0;
		int idx = 0;
		int max = 0;
		for (int i = 0; i < count; i++) {
			int newRecent = Integer.parseInt(rows[i][1]);
			diff = newRecent - recent;
			if (diff > max) {
				max = diff;
				idx = i;
			}
		}
		
		System.out.printf("확진자가 제일 많은 날: %s", rows[idx][0]);
		System.out.println();
		System.out.printf("확진자 수: %s", rows[idx][1]);

	}
}
