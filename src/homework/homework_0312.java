package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class homework_0312 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/제주특별자치도_코로나현황_20201214.csv");
		Scanner fscan = new Scanner(fis);
		String title = fscan.nextLine();
		String[] titleArray= title.split(",");
		
		String data = fscan.nextLine();
		String[] dataArray = data.split(",");
		String year = dataArray[0].substring(0,4);
		String month = dataArray[0].substring(5,7);
		String day = dataArray[0].substring(8,10);
		
		System.out.println("————————————————");
		System.out.printf("%s: %s년 %s월 %s일\n", titleArray[0], year, month, day);
		System.out.printf("%s: %s명\n", titleArray[1], dataArray[1]);
		System.out.printf("%s: %s명\n", titleArray[2], dataArray[2]);
		System.out.println("————————————————");
}
}
