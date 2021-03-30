package homework;

public class CalenderConsole {
	private Calender calender;
	
	//1. Association Has A 상속
	public CalenderConsole(Calender calender) {
		this.calender = calender; // 이제 매개변수로 받은 캘린더가 이 클래스의 캘린
	}
	
	//2. Composition Has A 상속
	public CalenderConsole() {
		calender = new Calender(); //생성자 안에 생성자, 일체형
		calender.setMonth(9);
		calender.setDay(16);
	}
	
	public void print() {
		System.out.printf("%d월 %d일\n", calender.getMonth(), calender.getday());
	}
}
