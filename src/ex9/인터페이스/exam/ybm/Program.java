package ex9.인터페이스.exam.ybm;


public class Program {
	public static void main(String[] args) {
		YBMExam exam = new YBMExam(1, 1, 1, 1, 1);
		YBMExamConsole console = new YBMExamConsole();
//		YBMExamConsole.XXX x = console.new XXX();
//		클래스 안 클래스, 즉 중첩된 클래스를 생성할 때는 앞에 console, 즉 this가 생략되어 있
//		console.setBanner(x);
		console.setExam(exam);

		console.input();
		console.print();
	}
}