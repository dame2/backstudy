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
	
	protected int baseTotal() {
		return this.kor+eng+math;
	}
	public abstract int total();
	
	public abstract float avg();

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	
}
