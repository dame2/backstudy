package ex8.추상화;

public abstract class Exam {
	private int kor;
	private int eng;
	private int math;

	public Exam(int value) {
		// 기본값
		kor = 10;
		eng = 10;
		math = 10;
	}

	// 오버로드 생성자
	public Exam(int kor, int eng, int math) {
		// 기본값
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int total(int ext) {
		return this.kor + eng + math;
	}
	
	public int total() {
		return this.kor + eng + math;
	}
	
	public abstract float avg();
}
