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
	public static boolean exercise415(char ch){
		if (ch > 'a' || ch < 'z')
			if(ch > 'A'|| ch <'Z')
			return true;
		return false;
	}
	public static boolean exercise416(int year){
		if (year % 400 == 0)
			return true;
			if (year % 4 == 0 && !(year % 100 == 0))
			return true;
		return false;
	}
	public static boolean exercise417(boolean powerOn){
		if(powerOn == false)
			return true;
		return false;
	}
	public static boolean exercise418(String str){
		if (str == "yes")
			return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(exercise411(15));
		System.out.println(exercise411(21));
		System.out.println("--------------------------------------");
		System.out.println(exercise412(' '));
		System.out.println("--------------------------------------");
		System.out.println(exercise413('X'));
		System.out.println(exercise413('A'));
		System.out.println("--------------------------------------");
		System.out.println(exercise414('0'));
		System.out.println(exercise414('a'));
		System.out.println("--------------------------------------");
		System.out.println(exercise415('a'));
		System.out.println(exercise415('A'));
		System.out.println(exercise415('2'));
		System.out.println("--------------------------------------");
		System.out.println(exercise416(400));
		System.out.println(exercise416(40));
		System.out.println(exercise416(100));
		System.out.println("--------------------------------------");
		System.out.println(exercise417(false));
		System.out.println(exercise417(true));
		System.out.println("--------------------------------------");
		System.out.println(exercise418("yes"));
		System.out.println(exercise418("no"));
		System.out.println(exercise418("Yes"));
		
		try{
			
		} finally {
			
		}
	}
}