package ex6.capsule.lotto;

import java.util.Random;

public class Lotto {
	private int[] nums; //외부에서 볼 수 없도록
	private int size;
	
	public static void init(Lotto lotto) {
		lotto.size=6;
		lotto.nums = new int[lotto.size];
	}
	static int getNums(Lotto lotto, int idx){
		return lotto.nums[idx];
	}
	
	
	 public static int getSize(Lotto lotto) {
		return lotto.size;
	}
	static void sort(Lotto lotto) {
			for(int j=0;j<lotto.size;j++)
				for (int i = 0; i < lotto.size-1; i++)
					if (lotto.nums[i] > lotto.nums[i + 1]) {
						int temp = lotto.nums[i];
						lotto.nums[i] = lotto.nums[i + 1];
						lotto.nums[i + 1] = temp;
					}
		}
	 
	 public static Lotto gen(Lotto lotto) {

			
			Random rand = new Random();
		
			for (int i=0; i<6; i++) {
				lotto.nums[i] = rand.nextInt(45)+i;
				//자판기, 블랙박스
			}
			return lotto;
		}

}
