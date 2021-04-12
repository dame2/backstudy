package ex9.인터페이스;

public class Program {
//		인터페이스란? 두 사룸 또는 세계가 간접적으로 만날 수 있게 해 주는 도구 또는 접점
//		자바 인터페이스란? 객체 간의 조립을 "간접적으로" 조립(Has A)하게 해 주는 접점 또는 도구
	public static void main(String[] args) {
		YBMExam exam = new YBMExam(1,1,1,1,1);
		
//		ExamConsole console = new ExamConsole(); // Constructor DI
//		console.setExam(exam); //Setter DI
//		console.print();
		
		//3. 인터페이스를 구현하기
//		YBMBanner ybmBanner = new YBMBanner(); //4. 구현체를 생성하기
		
		YBMExamConsole ybmConsole = new YBMExamConsole();
		ybmConsole.setExam(exam);
		ybmConsole.setBanner(exam); //5. 구현체를 꽂아주기
		
		ybmConsole.input();
		ybmConsole.print();
		
		
	}
}
