package ex9.인터페이스;

public class YBMExam extends Exam{
	private int toeic;
	
	public YBMExam(int kor, int eng, int math, int toeic) {
		super(kor, eng, math);
		this.toeic = toeic;
	}
	@Override
	public int total() {
		return super.total() + toeic;
	}
	@Override
	public float avg() {
		return total() / 5.0f;
	}
}
