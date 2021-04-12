package ex9.인터페이스.exam;

import java.util.Scanner;

public class ExamConsole {
	private Exam exam;
//	private PrintListner printLister;

	private Banner banner;
	
	public ExamConsole() {
		
	}
	
	public ExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	
	public void setBanner(Banner banner) {
		this.banner = banner;
	}

	protected Exam getExam() {
		return exam;
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	
	
	
	//onPrint만 override함으로써 print를 재사용할 수 있게 되었다
	public void print() {
//		System.out.println("---------------");
//		System.out.println("    성적 출력     ");
//		System.out.println("---------------");
		//2. 인터페이스를 이용하여 제품 마감처리하기
		banner.print();
		
		System.out.printf("kor:%d\n", exam.getKor());
		System.out.printf("eng:%d\n", exam.getEng());
		System.out.printf("math:%d\n", exam.getMath());
		
		//확장된 다른 과목이 출력될 수 있으려나?
//		if(printLister != null)
//			printListner.onPrint();
		onPrint();
		//이렇게 문을 열어 놓고 끼워넣기를하면 print 전부를 재정의하지 않아도 됨!
		System.out.printf("total:%d\n", exam.total());
		System.out.printf("avg:%f\n", exam.avg());
		System.out.println("---------------");
		banner.printEnd();
	}

	protected void onPrint() {
		
	}
	

	public void input() {
		Scanner scan = new Scanner(System.in);
		
		int kor, eng, math;
		
		System.out.print("kor:");
		kor = Integer.parseInt(scan.nextLine());
		System.out.print("eng:");
		eng = Integer.parseInt(scan.nextLine());
		System.out.print("math:");
		math = Integer.parseInt(scan.nextLine());
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}
}
