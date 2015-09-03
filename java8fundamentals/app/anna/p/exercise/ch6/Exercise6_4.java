package anna.p.exercise.ch6;

public class Exercise6_4 {
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.setName("HongGilDong");
		s.setClassRoom(1);
		s.setNumber(1);
		s.setKorScore(100);
		s.setEngScore(60);
		s.setMathScore(76);
		
		System.out.println("Name: " + s.getName());
		System.out.println("Score Total: " +s.getTotal());
		System.out.println("Average: " + s.getAverage());
	}
}
