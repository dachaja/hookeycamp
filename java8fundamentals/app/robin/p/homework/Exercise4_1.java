package robin.p.homework;

public class Exercise4_1 {
public static void main(String[] args) {
	
	int num = 15;
	boolean result = (num> 10 && num<20) ? true : false;
	
	
	char ch ='x';
	if ((ch == ' ') || (ch == '\t')) {
		
	} else {
		System.out.println("true");
	}
	boolean letter;
	if ((ch == 'x')|(ch == 'X'))
	letter = true;
	else
	letter = false;
	
	char ch1 = '0';
	System.out.println(ch1 + 0);
	boolean result1 = (ch1>0 && ch1<10)? true : false;
	
	if(ch1 > 48 && ch1 < 57) {
		System.out.println("true");
	} else {
		System.out.println("false");
	}
	
	
	System.out.println("Result =" + result);
	System.out.println("Result1 =" + result1);
}	
}
