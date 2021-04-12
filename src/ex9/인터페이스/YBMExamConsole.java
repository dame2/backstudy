package ex9.인터페이스;

import java.util.Scanner;

public class YBMExamConsole extends ExamConsole{
	
	
	@Override
	protected void onPrint() {
		YBMExam exam = (YBMExam)getExam();
		System.out.printf("toeic: %d\n", exam.getToeic());
		System.out.printf("aa: %d\n", exam.getAa());
	}
	
	public void Input() {
		super.input();
		Scanner scan = new Scanner(System.in);
		
		int toeic, aa;
		
		System.out.print("toeic:");
		toeic = Integer.parseInt(scan.nextLine());
		System.out.print("math:");
		aa = Integer.parseInt(scan.nextLine());
		
		YBMExam exam = (YBMExam)getExam(); //exam형을 바로 자식에 대입할 수 없기 때문에 형변환한다
		exam.setToeic(toeic);
		exam.setAa(aa);
	}

	

}
