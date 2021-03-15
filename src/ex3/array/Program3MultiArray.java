package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3MultiArray {

	public static void main(String[] args) throws IOException {

		String[] row1 = new String[10];
		String[] row2 = new String[10];
		
		FileInputStream fis = new FileInputStream("res/covid19.csv");
		Scanner fscan = new Scanner(fis);
		
		String line;
		fscan.nextLine();
		
		line = fscan.nextLine();
		row1 = line.split(",");

		line = fscan.nextLine();
		row2 = line.split(",");

		fscan.close();
		fis.close();

		for (int i = 0; i < 10; i++) {
			System.out.printf(row1[i]);
			if(i<9)
				System.out.print(",");
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.printf(row2[i]);
			if(i<9)
				System.out.print(",");
		}
		System.out.println();
	}

}
