package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import ex4.struct.Covid19;

public class homework_0317 {
	public static void main(String[] args) throws IOException {
		int count;
		{
			FileInputStream fis = new FileInputStream("res/covid19.csv");
			Scanner fscan = new Scanner(fis);
			fscan.nextLine();
			count = 0;
			while (fscan.hasNext()) {
				count++;
				fscan.nextLine();
			}
			fscan.close();
			fis.close();
		}
		
		String[][] rows = new String[count][];
		{
			FileInputStream fis;
			Scanner fscan;
			String line;

			fis = new FileInputStream("res/covid19.csv");
			fscan = new Scanner(fis);
			fscan.nextLine();
			
			for (int j = 0; j < count; j++) {
				line = fscan.nextLine();
				rows[j]=line.split(",");
			}
			fscan.close();
			fis.close();
		}
		/*
		 * rows 배열의 제주확진자 - 완치(격리해제)값을 2차원배열 result에 추가하여 result 배열을 날짜 diff 완치(격리해제)
		 * 이렇게 3개로 구성한뒤 출력하세요
		 */
		int num = 0;
		int current = Integer.parseInt(rows[0][1]);
		for (int i = 0; i < count; i++) {
			int next = Integer.parseInt(rows[i][1]);
			if (current != next) {
				num++;
				current = next;
			}
		}

		int dayPositive; //그날의 확진자
		int fresh; //확진자-완치자
		int number=0;
		String[][] result = new String[num][3];

		
		current = Integer.parseInt(rows[0][1]);
		for (int i = 0; i < count; i++) {
			int next = Integer.parseInt(rows[i][1]);
			if (current != next) {
				dayPositive = next - current;
				fresh = Integer.parseInt(rows[i][1]) - Integer.parseInt(rows[i][6]);
	
				
				result[number][0]= rows[i][1]; // 날짜
				result[number][1] = String.valueOf(dayPositive); // 그날의 확진자
				result[number][2] = String.valueOf(fresh); // 확진자-완치자
				current = next;
				number++;
			}
		}

		for (int i = 0; i < num; i++) {
			System.out.printf("날짜: %s\t, 확진자:%s\t,확진자-완치자:%s\n", result[i][0], result[i][1], result[i][2]);
		}
	}
}
