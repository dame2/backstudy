package ex3.array.test;

import java.util.Random;

public class Program3 {

	public static void main(String[] args) {

		String[] names = new String[] { "강호동", "유재석", "하하", "김지호", "김현준", "김태희", "박민정" };
//
//		String n1 = "홍길동";
//		String n2 = "홍길동";
//		String n3 = new String("홍길동");
//		String n4 = new String("홍길동");
//		System.out.println(n1 == n2);
//		System.out.println(n1.equals(n2));
//		System.out.println(n3 == n4);
//		System.out.println(n3.equals(n4));
//		
//	
//		String fileName = "photo.jpg";
//		System.out.println(fileName.length());
//		System.out.println(fileName.indexOf(".")); //점이 있는 곳까가 몇 번째인지
//		System.out.println(fileName.substring(3)); //3번째 문자까지만 출력
//		int pos = fileName.indexOf(".");
//		System.out.println(fileName.substring(0,pos));//확장자를 제외한 파일명
//		System.out.println(fileName.compareTo("aest.jpg"));
		Random rand = new Random();
//		
//		for(int j=0; j<9-1; j++)
//			for(int i=0; i<100; i++) {
//				int idx1 = rand.nextInt(10);
//				int idx2 = rand.nextInt(10);
//				System.out.printf("idx1: %d, idx2: %d\n", idx1, idx2);
//			
//				String name;
//				name = names[i];
//				names[i] = names[i + 1];
//				names[i + 1] = name;
//			}

		// 정렬..
		for (int j = 0; j < names.length - 1 - 1; j++)
			for (int i = 0; i < names.length - 1 - j; i++) {
				String name = names[i];
				if (0 < name.compareTo(names[i + 1])) {
					name = names[i];
					names[i] = names[i + 1];
					names[i + 1] = name;
				}
			}

		for (int i = 0; i < 7; i++) {
			System.out.printf("\"%s\"", names[i]);

			// 예외 항목
			if (i < 7 - 1)
				System.out.print(",");

		}
	}
}
