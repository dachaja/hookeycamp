package jasper.k.homework;

public class Warmup1monkeyTrouble {
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile == true) {
			if (bSmile == true) {
				boolean monkeyTrouble;
				return monkeyTrouble = true;
				
			} else {
				boolean monkeyTrouble;
				return monkeyTrouble = false;
			}
		} else {
			if (bSmile == true) {
				boolean monkeyTrouble;
				return monkeyTrouble = false;
			
			} else {
				boolean monkeyTrouble;
				return monkeyTrouble = true;
			}
		}
	}
	public static void main(String[] args) {
		boolean result = monkeyTrouble(true, true);
		System.out.println(" aSmile = true, bSmile = true" +  result);
		result = monkeyTrouble(true, false);
		System.out.println(" aSmile = true, bSmile = false" +  result);
		result = monkeyTrouble(false, true);
		System.out.println(" aSmile = false, bSmile = true" +  result);
		result = monkeyTrouble(false, false);
		System.out.println(" aSmile = false, bSmile = false" +  result);
		// http://codingbat.com/prob/p181646
		

	}
}