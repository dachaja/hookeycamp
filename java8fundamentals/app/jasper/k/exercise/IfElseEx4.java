package jasper.k.exercise;

public class IfElseEx4 {
	public static void main(String[] args) {
		String title = ""; // empty
		String title1; // null
		
		boolean isMale = true;
		if (isMale) {
			title = "Mr.";
		} else {
			title = "Ms.";
		}
		System.out.println(title);
	}
}
