package ex4.struct;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		Covid19[] list = null;
		// 모두 null이다, null에다 데이터를 어떻게 쓰느냐

		// count 알아내기
		int count;
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

			count--;
		}

		list = new Covid19[count];
		
		// 레코드를 로드하는 코드
		{
			FileInputStream fis;
			Scanner fscan;
			String line;

			fis = new FileInputStream("res/covid19.csv");
			fscan = new Scanner(fis);

			fscan.nextLine();

			for (int i = 0; i < count; i++) {
				line = fscan.nextLine();
				String[] tokens = line.split(","); // 잘게 잘라서 토큰에 넣음

				Covid19 covid = new Covid19();
				covid.date = tokens[0];
				covid.cases = Integer.parseInt(tokens[1]);
				covid.deaths = Integer.parseInt(tokens[2]);
				covid.tests = Integer.parseInt(tokens[3]);
				covid.selfIsolation = Integer.parseInt(tokens[4]);
				covid.release = Integer.parseInt(tokens[5]);
				covid.recover = Integer.parseInt(tokens[6]);
				covid.selfQuarantineDomestic = Integer.parseInt(tokens[7]);
				covid.selfQuarantineInported = Integer.parseInt(tokens[8]);
				covid.pubDate = tokens[9];

				list[i] = covid;
			}
			fscan.close();
			fis.close();
		}

		// 레코드를 출력하는 코드
		{
			for(int i=0;i<count;i++) {
				Covid19 covid = list[i];
				System.out.printf("%s, %d, %d, %d, %d, %d, %d, %d, %d, %s\n", covid.date, covid.cases, covid.deaths, covid.tests, covid.selfIsolation, covid.release, covid.recover, covid.selfQuarantineDomestic, covid.selfQuarantineInported, covid.pubDate);
			}
		}
	}
}
