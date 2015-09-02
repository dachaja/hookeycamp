package jasper.k.ch7;

public class Exercise3_10 {
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = (ch >= 65 && ch <= 90) ? (lowerCase = (char)(ch+32)) : ch ;
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}
