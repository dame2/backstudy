package ex6.capsule.corona;

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		Covid19[] rows = null;

		// 1. 레코드 개수를 알아내는 코드
		Covid19.setCount();

		// 2. 객체를 생성하는 코드
		rows = new Covid19[Covid19.setCount()];

		// 3. 레코드를 로드하는 코드
		rows = Covid19.load(rows);

		// 4. 레코드를 출력하는 코드
		printCovid19List(rows);

		// 5. 검사진행자 누적수를 얻는 코드
		Covid19.setTotal(rows);

		// 6. 일별 가장 많은 검사진행수 max 구하기
		Covid19.setMax(rows);
		printMax(rows);

		// 7. 검사진행수가 가장 많았던 날짜는?
		String date = Covid19.setDate(rows);
		System.out.println(date);

		// 확진자 수가 늘어난 일자와 수를 출력하면?
		printInc(rows);
	}

	// 4. 레코드를 출력하는 코드
	public static void printCovid19List(Covid19[] rows) {
		System.out.println("--레코드를 출력하는 함수");
		for (int i = 0; i < Covid19.getCount(); i++) {
			Covid19 covid = rows[i];
			System.out.printf("%s, %d, %d, %d, %d, %d, %d, %d, %d, %s\n", covid.date, covid.cases, covid.deaths,
					covid.tests, covid.selfIsolation, covid.release, covid.recover, covid.selfQuarantineDomestic,
					covid.selfQuarantineInported, covid.pubDate);
		}

	}

	private static void printInc(Covid19[] rows) {
		String date = "";
		int diff = 0;

		int old = 0; // 현재 확진자 수
		int index = 0;
		for (int i = 0; i < Covid19.getCount(); i++) {
			int current = rows[i].cases;

			if (old != current) {

				diff = current - old;
				date = rows[i].date;

				old = current;
				System.out.printf("%d : %s, %d\n", index++ + 1, date, diff);

			}
		}

	}

	static void printMax(Covid19[] rows) {
		System.out.printf("일별 가장 많은 검사진행수: %d\n", Covid19.getMax());
	}

}