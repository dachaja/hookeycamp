package jasper.k.ch9;

public class Exercise4_1 {
	public static boolean exercise411(int x){
		if (x > 10 && x < 20)
			return true;
		return false;
	}
	public static boolean exercise412(char ch){
		if (ch == ' '||ch == '	')
			return true;
		return false;
	}
	public static boolean exercise413(char ch){
		if(ch == 'x' || ch == 'X')
			return true;
		return false;
	}
	public static boolean exercise414(char ch){
		if (Character.isDigit(ch))
			return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(exercise411(15));
		System.out.println(exercise411(21));
		System.out.println(exercise412(' '));
		System.out.println(exercise413('X'));
		System.out.println(exercise413('A'));
		System.out.println(exercise414('0'));
		System.out.println(exercise414('a'));
}
}