package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class homework_0312 {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("res/covid19.csv");
		Scanner scan = new Scanner(fis);
		Scanner nscan = new Scanner(System.in);
		int number = 0;
		int total = 0;

		String line = scan.nextLine();
		String[] title = line.split(",");

		int[] realTotal = new int[9];
			for (int i = 0; i < 8; i++) {
				while (scan.hasNextLine()) {
					line = scan.nextLine();
					String[] result = line.split(",");
					total += Integer.parseInt(result[i+1]);
				}
				realTotal[i] = total;
			}
		
		System.out.printf(
				"원하시는 합계의 번호를 입력해 주세요\n———————————————\n[1]%s\n[2]%s\n[3]%s\n[4]%s\n[5]%s\n[6]%s\n[7]%s\n[8]%s\n———————————————\n입력: ",
				title[0], title[1], title[2], title[3], title[4], title[5], title[6], title[7]);
		number = nscan.nextInt();
		while (number < 1 || number > 8) {
			System.out.print("범위에 없는 번호입니다. 다시 입력해 주세요.\n입력: ");
			number = nscan.nextInt();
		}
		System.out.printf("%s 합계: %d", title[number], realTotal[number]);

		scan.close();
		nscan.close();
	}

}
