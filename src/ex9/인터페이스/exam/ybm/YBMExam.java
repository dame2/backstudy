package ex9.인터페이스.exam.ybm;

import ex9.인터페이스.exam.Banner;
import ex9.인터페이스.exam.Exam;

public class YBMExam extends Exam{
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



}
