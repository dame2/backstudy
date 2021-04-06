package ex8.추상화;

public class ExamConsole {
	private Exam exam;
//	private PrintListner printLister;

	public ExamConsole(Exam exam) {
		super();
		this.exam = exam;
	}

	public void print() {
		System.out.println("---------------");
		System.out.println("    성적 출력     ");
		System.out.println("---------------");
		System.out.printf("kor:%d\n", exam.getKor());
		System.out.printf("kor:%d\n", exam.getEng());
		System.out.printf("kor:%d\n", exam.getMath());
		
		//확장된 다른 과목이 출력될 수 있으려나?
//		if(printLister != null)
//			printListner.onPrint();
		System.out.printf("kor:%d\n", exam.total());
		System.out.printf("kor:%d\n", exam.avg());
		System.out.printf("baseTotal:%d\n", exam.baseTotal());
		System.out.println("---------------");
	}

	public ExamConsole() {
		
	}
	public void setExam(Exam exam) {
		this.exam = exam;

	}
}
