package ex7.상속.Is_a;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		kor = 10;
		eng = 10;
		math = 10;
	}
	
	public int total() {
		return this.kor + eng + math;
	}
	
	public float avg() {
		return total()/3.0f;
	}
}
