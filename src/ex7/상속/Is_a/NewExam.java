package ex7.상속.Is_a;

public class NewExam extends Exam{
	private int com;
	
	public NewExam() {
		com = 10;
	}
	@Override
	public int total() {
		return super.total()+com;
	}
	@Override
	public float avg() {
		return total()/4.0f;
	}
	
}
