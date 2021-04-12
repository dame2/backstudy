package ex9.인터페이스.exam.ybm;

import java.util.Scanner;

import ex9.인터페이스.exam.Banner;
import ex9.인터페이스.exam.ExamConsole;
import ex9.인터페이스.exam.ybm.YBMExamConsole.XXX;

public class YBMExamConsole extends ExamConsole {
	public int a;

	public YBMExamConsole() {
		//함수 안에 인터페이스 클래스 구현
	Banner banner = new Banner() {
		@Override
		public void print() {
			// 중첩된 클래스 안에서는 쟤의 변수도 쓸 수 있다
			a = 3;

			System.out.println("----------------");
			System.out.println("   YBM 성적 출력  ");
			System.out.println("----------------");
		}

		@Override
		public void printEnd() {
			System.out.println("---------------");
		}
	};
		setBanner(banner);
		a = 3;
}

	@Override
	protected void onPrint() {
		YBMExam exam = (YBMExam) getExam();
		System.out.printf("toeic: %d\n", exam.getToeic());
		System.out.printf("aa: %d\n", exam.getAa());
	}

	@Override
	public void input() {
		super.input();
		Scanner scan = new Scanner(System.in);

		int toeic, aa;

		System.out.print("toeic:");
		toeic = Integer.parseInt(scan.nextLine());
		System.out.print("math:");
		aa = Integer.parseInt(scan.nextLine());

		YBMExam exam = (YBMExam) getExam(); // exam형을 바로 자식에 대입할 수 없기 때문에 형변환한다
		exam.setToeic(toeic);
		exam.setAa(aa);
	}

	

}