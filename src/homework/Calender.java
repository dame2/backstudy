package homework;

public class Calender {
	private int month = 12;
	private int day = 31;
	
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public int getday() {
		return day;
	}

	public static void main(String[] args) {
		Calender calender = new Calender();
		CalenderConsole console = new CalenderConsole(calender);
		calender.setMonth(8);
		calender.setDay(15);
		console.print();
		

		CalenderConsole console2 = new CalenderConsole();
		console2.print();
	}
}
