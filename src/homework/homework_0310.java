package homework;

public class homework_0310 {
	public static void main(String[] args) {
		/*
		 * back-end 과제 2중for문으로 구구단 출력하기
		 */

		for (int j = 2; j < 10; j++) {
			for (int i = 1; i < 10; i++)
				System.out.printf("%d*%d=%d ", j, i, i * j);
			System.out.println();
		}
	}
}
