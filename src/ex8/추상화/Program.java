package ex8.추상화;

/*
 * 상속:
 * Has A 상속
 * Is A 상속
 */
public class Program {

	public static void main(String[] args) {
		
		Exam exam = new YBMExam(1,1,1,1);
		
		ExamConsole console = new ExamConsole(); // Constructor DI
		console.setExam(exam); //Setter DI
		console.print();
		
		YBMExamConsole ybmConsole = new YBMExamConsole();
		ybmConsole.setExam(exam);
		
		ybmConsole.print();
		
		
		
		// 성적:뉴렉고, YBM고..
//		Exam[] exams = new Exam[2];
//		
//		exams[0] = new YBMExam(1, 1, 1, 1);
//		exams[1] = new NewExam(2,2,2,2);
//		
//		for(int i = 0; i < 2; i++)
//			System.out.println(exams[i].avg());
//
	}
}
