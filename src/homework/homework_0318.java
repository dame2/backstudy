package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import ex4.struct.Covid19;

public class homework_0318 {
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
		
		Covid[] rows = new Covid[count];
		for(int i =0;i<count;i++)
			rows[i] = new Covid();
		{
			FileInputStream fis;
			Scanner fscan;
			String line;

			fis = new FileInputStream("res/covid19.csv");
			fscan = new Scanner(fis);
			fscan.nextLine();

			for (int j = 0; j < count; j++) {
				line = fscan.nextLine();
				rows[j].date = line.split(",")[0];
				rows[j].positive=Integer.parseInt(line.split(",")[1]);
				rows[j].rec=Integer.parseInt(line.split(",")[6]);
				
//				rows[j].positive = Integer.parseInt(line.split(","));
			}
			fscan.close();
			fis.close();
		}
		/*
		 * rows 배열의 제주확진자 - 완치(격리해제)값을 2차원배열 result에 추가하여 result 배열을 날짜 diff 완치(격리해제)
		 * 이렇게 3개로 구성한뒤 출력하세요
		 */
		int num = 0;
		int current = rows[0].positive;
		for (int i = 0; i < count; i++) {
			int next = rows[i].positive;
			if (current != next) {
				num++;
				current = next;
			}
		}

		int dayPositive; //그날의 확진자
		int fresh; //확진자-완치자
		int number=0;
		Covid[] result = new Covid[num];
		for(int i =0;i<num;i++)
			result[i] = new Covid();
		
		current = rows[0].positive;
		for (int i = 0; i < count; i++) {
			int next = rows[i].positive;
			if (current != next) {
				dayPositive = next - current;
				fresh = rows[i].positive - rows[i].rec;
	
				
				result[number].date = rows[i].date; // 날짜
				result[number].dayPositive = dayPositive; // 그날의 확진자
				result[number].fresh = fresh; // 확진자-완치자
				current = next;
				number++;
			}
		}

		for (int i = 0; i < num; i++) {
			System.out.printf("날짜: %s\t, 확진자:%d\t,확진자-완치자:%d\n", result[i].date, result[i].dayPositive, result[i].fresh);
		}
	}

}
