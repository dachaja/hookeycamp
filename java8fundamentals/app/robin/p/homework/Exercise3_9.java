package robin.p.homework;

public class Exercise3_9 {

	public static void main(String[] args) {
		char ch = 'f';
		boolean b = ((ch >= 48 && ch <=59) ? true : (ch >=65 && ch <= 90) ? true : (ch >=97 && ch <=122) ? true : false);
		System.out.println(b);
	}
}
