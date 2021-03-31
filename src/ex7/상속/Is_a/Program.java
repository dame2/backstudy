package ex7.상속.Is_a;

/*
 * 상속:
 * Has A 상속
 * Is A 상속
 */
public class Program {

	public static void main(String[] args) {
		
		//성적 데이터
		NewExam exam = new NewExam();
		int total = exam.total();
		float avg = exam.avg();
		
		System.out.printf("total: %d, avg: %f\n", total, avg);
		}

}
