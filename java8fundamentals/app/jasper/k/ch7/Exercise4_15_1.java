package jasper.k.ch7;

public class Exercise4_15_1 {
	public static void main(String[] args) {
		int num = 12421;
		int tmp = num;
		
		int result = 0;
		while(tmp != 0){
			result = (result *10)+(tmp%10);
			tmp = tmp/10;
		}
		if ( result == num)
			System.out.println(num+"회문수가 맞습니다.");
		else
			System.out.println(num+"회문수가 아닙니다.");
	}
}
