package anna.p.exer.ch9;

public class StackTraceTest {
	public static void main(String[] args) {
		try {
			m1();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void m1() throws MyException {
		String str = "error";
		if(str.equalsIgnoreCase("error")) m2();
		// Do nothing
	}
	public static void m2() throws MyException  {
		throw new MyException("Some error has occurred.");
	}
}
