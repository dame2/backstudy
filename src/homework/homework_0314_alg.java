package homework;

import java.util.Scanner;

public class homework_0314_alg {
	// 선형 검색: 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다
	static int seqSearch(int[] a, int n, int key) {
		for (int i = 0; i < n; i++) {
			if (a[i] == key)
				return i; // 검색 성공! index를 반환
		}
		return -1; // 검색 실패! -1을 반환
	}

	
	
	// 선형 검색:보초법: 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key; // 보초를 추가
		while (true) {
			if (a[i] == key) // 검색 성공!
				break;
			i++;
		}
		return i == n ? -1 : i; // 찾은 값이 원래 데이터인지 보초인지? 변수 i의 값이 n이면 찾은 값이 보초이므로 실
	}

	
	
	// 이진검색: 요소가 오름차순 혹은 내림차순으로 정렬된 배열에서 사용
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; //검색 범위의 첫 인덱스
		int pr = n-1; //검색 범위의 끝 인덱스
		do {
			int pc = (pl + pr) / 2 ; 	// 중앙 요소의 인덱스
			if (a[pc] == key)
				return pc;				 // 검색 성공!
			else if (a[pc]<key)
				pl = pc+1;				 // 검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc-1;				// 검색 범위를 앞쪽 절반으로 좁힘
		}
		while (pl <= pr);
		return -1; // 검색 실패!
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[ " + i + "]:");
			x[i] = scan.nextInt();
		}
		System.out.print("검색할 값:");
		int ky = scan.nextInt();
		int idx = seqSearch(x, num, ky);
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		
		scan.close();
	}

}
