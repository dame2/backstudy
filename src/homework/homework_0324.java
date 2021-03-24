package homework;

import java.util.Scanner;

public class homework_0324 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fullness = 0;
		int fullMax = 100;
		int level = 1;

		int[][] food = new int[5][2];
		food[0][0] = 40;
		food[1][0] = 30;
		food[2][0] = 20;
		food[3][0] = 30;
		food[4][0] = 5;
		boolean yes = true;
		while (yes) {
			// 음식 먹는 메소드
			System.out.println("먹일 음식 번호를 입력하세요: ");
			System.out.println("1. egg 2. tomate 3. earlgray 4. beer 5. coffee");
			int foodName = scan.nextInt();
			scan.nextLine();
			fullness = feed(food, foodName, fullness);

			for (int i = 0; i < 5; i++)
				if (foodName == i)
					food[i][1]++;
			// 레벨 업
			if (fullness > fullMax) {
				level++;
				fullMax += 50;
			}
			// 출력하는 메소드
			print(fullness, level, food);
			System.out.println();
			
			System.out.println("계속하시겠습니까? y / n");
			String answer = scan.next();
			if (answer == "n")
				yes = false;
			else
				yes = true;
		}
	}

	private static void print(int fullness, int level, int[][] food) {
		System.out.printf("포만감: %d ", fullness);
		System.out.printf("레벨: %d\n뱃속에는 ", level);
		System.out.printf("\negg %d개 \ntomate %d개 \nearlgray %d개 \nbeer %d개 \ncoffee %d개", food[0][1], food[1][1], food[2][1],
				food[3][1], food[4][1]);

	}

	private static int feed(int[][] food, int foodName, int fullness) {
		int select = 0;
		for (int i = 0; i < 5; i++) {
			if (foodName == i)
				select = food[i][0];
		}
		fullness += select;
		return fullness;
	}

}
