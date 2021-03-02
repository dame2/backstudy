package homework;

import java.util.Scanner;

//Mission: Scanner 클래 console stream 이용해서 자기소개, 마지막 문장은 printf를 이용

class Homework_210302 {
	public static void main(String[] args) {
		String name, location, hobby;
		int age;

		System.out.println("┌────────────────────────────┐");
		System.out.println("│          정보 입력           │");
		System.out.println("└────────────────────────────┘");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		name = scan.next();
		System.out.print("나이를 입력하세요: ");
		age = scan.nextInt();
		System.out.print("지역을 입력하세요: ");
		location = scan.next();
		System.out.print("취미를 입력하세요: ");
		hobby = scan.next();
		

		System.out.println("┌────────────────────────────┐");
		System.out.println("│          나의 정보           │");
		System.out.println("└────────────────────────────┘");

		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d\n", age);
		System.out.printf("지역: %s\n", location);
		System.out.printf("취미: %s\n", hobby);

		System.out.printf("제 이름은 %s 나이는 %d이고요 사는 곳은 %s 취미는 %s입니다", name, age, location, hobby);
		
	}
}