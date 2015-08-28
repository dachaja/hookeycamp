package anna.p.exercise.ch7;

public class PointTest {
	public static void main(String[] args) {
		Point pt = new Point(10,12);
		
		String str1 = "Test " + pt;
		String str2 = "Test " + pt.toString();
		
		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(str1);
		System.out.println(str2);
		
		Object obj = new Object();
		boolean bl = obj.equals(obj);
		
		try {
			pt.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
