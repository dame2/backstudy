package ex6.capsule.corona;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Scanner;

public class Covid19 {
	static int max;
	static int count;
	static int total;
	
	String date;
	int cases;
	int deaths;
	int tests;
	int selfIsolation;
	int release;
	int recover;
	int selfQuarantineDomestic;
	int selfQuarantineInported;
	String pubDate;

	public static int getMax() {
		return max;
	}

	public static int getCount() {
		return count;
	}

	public static int getTotal() {
		return total;
	}

	// 1. 레코드 개수를 알아내는 코드
	public static int setCount() throws IOException {
		FileInputStream fis = new FileInputStream("res/covid19.csv");
		Scanner fscan = new Scanner(fis);
		int count = 0;
		// while 반복을 하면서 count++ 연산을 한다. 마지막 줄을 만날 때까지
		while (fscan.hasNextLine()) {
			fscan.nextLine();
			count++;
		}

		fscan.close();
		fis.close();

		count--;
		
		return count;
	}

	// 3. 레코드를 로드하는 코드
	public static Covid19[] load(Covid19[] rows) throws IOException {

		FileInputStream fis = new FileInputStream("res/covid19.csv");
		Scanner fscan = new Scanner(fis);
		String line;

		fscan.nextLine();

		for (int i = 0; i < Covid19.getCount(); i++) {
			line = fscan.nextLine();
			String[] tokens = line.split(",");

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

			rows[i] = covid;

		}
		fscan.close();
		fis.close();

		return rows;
	}

	// 5. 검사진행자 누적수를 얻는 코드
	static int setTotal(Covid19[] rows) {
		System.out.println("--total을 계산하는 함수");
		for (int i = 0; i < count; i++)
			total += rows[i].tests;
		return total;
	}

	// 6. 일별 가장 많은 검사진행수 max 구하기
	static int setMax(Covid19[] rows) {
		int max = 0;

		for (int i = 0; i < Covid19.getCount(); i++) {
			int current = rows[i].tests;
			if (current > max)
				max = current;
		}
		return max;
	}

	// 7. 검사진행수가 가장 많았던 날짜는?
	static String setDate(Covid19[] rows) {
		int idx = 0;
		String date = "";
		for (int i = 0; i < Covid19.getCount(); i++)
			if (Covid19.getMax() == rows[i].tests) {
				idx = i;
				break;
			}
		date = rows[idx].date;
		return date;
	}

}
