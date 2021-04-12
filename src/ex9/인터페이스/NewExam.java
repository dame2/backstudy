package ex9.인터페이스;

public class NewExam extends Exam {
	private int com;

	public NewExam() {
		this(1,1,1,1);
		// super(); 슈퍼 생성자를 this가 호출
	}

	public NewExam(int kor, int eng, int math, int com) {
		// super();
		super(kor, eng, math);
		this.com = com;
		//대입을 하려는 순간 슈퍼 생성자가 호출되었는지 확인하고 안 되었으면 오류가 나니 앞에 해 줌

	}

	@Override
	public int total() {
		return baseTotal() + com;
	}

	@Override
	public float avg() {
		return total() / 4.0f;
	}

}
