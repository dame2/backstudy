package homework;

//Mission : int로 된 kor, eng, math, total의 출력값 형식을 소수점 둘째자리 까지 보이지도록 출력(단, 선언된 변수의 타입 변경 불가)

class Homework_20210226 {
	public static void main(String[] args) {
		int kor, eng, math, total;
		double avg;
		kor = 80;
		eng = 70;
		math = 100;

		total = kor + eng + math;
		avg = total / 3.0;

		System.out.println("┌────────────────────────────┐");
		System.out.println("│          성적 출력           │");
		System.out.println("└────────────────────────────┘");

		System.out.printf("국어 1: %3.2f\n", (double)kor);
		System.out.printf("수학 1: %3.2f\n", (double)math);
		System.out.printf("영어 1: %3.2f\n", (double)eng);

		System.out.printf("총점: %3.2f\n", (double)total);
		System.out.printf("평균: %3.2f\n", (double)avg);
	}
}