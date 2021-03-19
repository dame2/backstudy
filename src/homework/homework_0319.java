package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.Line;

import ex4.struct.Covid19;

public class homework_0319 {
	public static void main(String[] args) throws IOException {
		int count;
		Covid[] list = null;
		{
			FileInputStream fis = new FileInputStream("res/covid19.csv");
			Scanner fscan = new Scanner(fis);
			fscan.nextLine();
			count = 0;
			while (fscan.hasNext()) {
				fscan.nextLine();
				count++;
			}
			fscan.close();
			fis.close();
			count--;
		}

		list = new Covid[count];
		String[] title = null;

		{
			FileInputStream fis = new FileInputStream("res/covid19.csv");
			Scanner fscan = new Scanner(fis);
			String line;

			title = new String[10];
			line = fscan.nextLine();
			title = line.split(",");

			for (int i = 0; i < count; i++) {
				line = fscan.nextLine();
//				String[] tokens = line.split(",");

				Covid covidIn = new Covid();
				covidIn.date = line.split(",")[0];
				covidIn.positive = Integer.parseInt(line.split(",")[1]);
				covidIn.deaths = Integer.parseInt(line.split(",")[2]);
				covidIn.tests = Integer.parseInt(line.split(",")[3]);
				covidIn.selfIsolation = Integer.parseInt(line.split(",")[4]);
				covidIn.release = Integer.parseInt(line.split(",")[5]);
				covidIn.rec = Integer.parseInt(line.split(",")[6]);
				covidIn.selfQuarantineDomestic = Integer.parseInt(line.split(",")[7]);
				covidIn.selfQuarantineInported = Integer.parseInt(line.split(",")[8]);
				covidIn.thisDate = line.split(",")[9];

				list[i] = covidIn;
//				rows[j].positive = Integer.parseInt(line.split(","));
			}
			fscan.close();
			fis.close();
		}
		for (int i = 0; i < count; i++) {
			Covid covidOut = list[i];
			System.out.printf("%s\t\t%s\t%s\t%s\t%s\t\t%s\t%s\t%s\t%s\t%s\t\n", title[0], title[1], title[2], title[3], title[4],
					title[5], title[6], title[7], title[8], title[9]);
			System.out.printf("%s\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%s\t\n", covidOut.date, covidOut.positive, covidOut.deaths,
					covidOut.tests, covidOut.selfIsolation, covidOut.release, covidOut.rec, covidOut.selfQuarantineDomestic,
					covidOut.selfQuarantineInported, covidOut.thisDate);
		}
	}

}
