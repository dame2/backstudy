package ex3.array.test;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// 배열 초기
		// 1. 정수 10개짜리 nums 배열을 생성한다. 단 1,2,3,~~10
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 섞는다..
		Random random = new Random();

		// 두 인덱스 위치의 값을 바꿔라
		int j = 0;
		while (j < 100) {
			int idx1 = random.nextInt(10);
			int idx2 = random.nextInt(10);
			int temp = nums[idx1];
			nums[idx1] = nums[idx2];
			nums[idx2] = temp;
			j++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d", nums[i]);
			if (i < 9)
				System.out.printf(",");
		}
		System.out.println();

		// 정렬
		// 제일 큰 놈을 찾아서 맨 뒤로 밀어내기
		// 1. nums의 0번째 값이 1번째 값보다 크다면
		// 두 위치의 값을 바꾸시오
		for (int p = 0; p < 9 - 1; p++)
			for (int i = 0; i < 10 - 1 - p; i++)
				if (nums[i] > nums[i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d", nums[i]);
			if (i < 9)
				System.out.printf(",");
		}
		System.out.println();

	}

}
