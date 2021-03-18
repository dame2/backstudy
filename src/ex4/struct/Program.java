package ex4.struct;

public class Program {

	public static void main(String[] args) {
		
		
		Covid19 row2 = new Covid19();
		
		Covid19[] list = new Covid19[10];
		 // 모두 null이다, null에다 데이터를 어떻게 쓰느냐
		list[0] = new Covid19();
		list[0].date = "3";
		//작업 필수, 2차원 배열 느낌, 톱니는 아님, 다양한 자료형을 묶어
		
		Covid19 row;
		row = new Covid19(); // Covid 안의 여러 자료형을 담을 수 있는 그릇을 row라고 만들어 줌
		row.date = "2020";
		row.deaths = 20;
	}
	
}
