package jasper.k.ch7;

public class Exercise3_9 {
	public static void main(String[] args) {
		char ch = '?';
		boolean b = (ch >= 97 ?true:( ch <= 122 ? true : (
				ch >= 65 ? true : (ch <= 90 ? true : ch >= 48? true :
					(ch <= 58 ? true : false)))) );
		System.out.println(b);
	}
}
