package anna.p.exercise.ch6;

public class Exercise6_22 {
	public static void main(String[] args) {
		String str = "1239";
		System.out.println("Is " + str + " is a number? " + isNumber(str));
		
		str = "12349a";
		System.out.println("Is " + str +" is a number? " + isNumber(str));
	}
	
	public static boolean isNumber(String str) {
		if(str==null || str.equals(""))
			return false;
		for(int i=0; i< str.length();i++) {
			char ch = str.charAt(i);
			if(ch < '0' || ch > '9') {
				return false;
			}
		} // for
		return true;
	}
	
	
	
	
	

	private static boolean isNumber2(String str) {
		if(str==null || str.equals("")) return false;
		if(str.matches("[0-9]+")) return true;
		else return false;
	}
}
