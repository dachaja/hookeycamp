package anna.p.exercise.ch9;

public class DivideByZero {
	public static void main(String[] args) {
		try {
			int x = 10, y = 0, z;
			z = x/y;
			System.out.println("z= " + z);
		} catch (Exception e) {
			
		}
	}
}
