package ex6.capsule2;


public class Lotto {
	int[] nums;

	public static void sort(Lotto lotto) {
		for(int j=0;j<lotto.nums.length;j++)
			for (int i = 0; i < lotto.nums[i] - 1; i++)
				if (lotto.nums[i] > lotto.nums[i + 1]) {
					int temp = lotto.nums[i];
					lotto.nums[i] = lotto.nums[i + 1];
					lotto.nums[i + 1] = temp;
				}
	}
}
