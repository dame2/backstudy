package ex6.capsule.lotto.Object.Constructor;

import java.util.Random;

public class Lotto {
	private int[] nums; // 외부에서 볼 수 없도록
	private int size;

	public Lotto() {
		size = 6;
		nums = new int[size];
	}

	public int getNum(int i) {
		int num = nums[i];
		return num;
	}

	public int getSize() {
		return size;
	}

	public void setSize (int size) {
		this.size = size;
	}

	// 객체지향적인 표현식으로 바뀐 함수
	// 객체를 사용하는 함수: Object function / Instance function / method
	public void sort() {
		for (int j = 0; j < size; j++)
			for (int i = 0; i < size - 1; i++)
				if (nums[i] > nums[i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
	}

	public void gen() {
		Random rand = new Random();

		for (int i = 0; i < 6; i++) {
			nums[i] = rand.nextInt(45) + 1;
			// 자판기, 블랙박스
		}
	}

	public void ascending() {
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++)
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
		}
	}
	public void descending() {
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size - 1; j++)
				if (nums[j] < nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
	}
}
