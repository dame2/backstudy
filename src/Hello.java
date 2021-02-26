class Hello{
    public static void main(String[] args){
	int kor, eng, math, total;
	double avg;
        kor = 80;
        eng = 70;
        math = 100;
        
        total = kor + eng + math;
        avg = total / 3.0;

	
	System.out.println("┌────────────────────────────┐");
	System.out.println("│          성적 출력           │");
	System.out.println("└────────────────────────────┘");
	
	System.out.printf("국어 1: %d\n", kor);
	System.out.printf("수학 1: %d\n", math);
	System.out.printf("영어 1: %d\n", eng);
	
	System.out.printf("총점: %d\n", total);	
	System.out.printf("평균: %4.2f\n", avg);
	
	System.out.printf("%1$d, %2$d, %2$d, %1$d", 1, 2);
    }
}