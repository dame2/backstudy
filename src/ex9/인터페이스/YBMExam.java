package ex9.인터페이스;

public class YBMExam extends Exam implements Banner{
	private int toeic;
	private int aa;
	
	public void setToeic(int toeic) {
		this.toeic = toeic;
	}
	
	public void setAa(int aa) {
		this.aa = aa;
	}
	
	public int getToeic(){
		return toeic;
	}
	
	public int getAa(){
		return aa;
	}
	
	public YBMExam(int kor, int eng, int math, int toeic, int aa) {
		super(kor, eng, math);
		this.toeic = toeic;
		this.aa = aa;
	}
	
	@Override
	public int total() {
		return baseTotal() + toeic + aa;
	}
	@Override
	public float avg() {
		return total() / 5.0f;
	}
	@Override
	public void print() {
		System.out.println("---------------");
		System.out.println("  YBM 성적 출력  ");
		System.out.println("---------------");
	}

	@Override
	public void printEnd() {
		System.out.println("---------------");
	}


}
