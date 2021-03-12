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
			
		System.out.println("원하시는 합계의 번호를 입력해 주세요.");
		System.out.println("———————————————");
				for(int i=1; i<8; i++)
					System.out.printf("[%d] %s\n", i, title[i]);
		System.out.print("———————————————\n입력: ");
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
