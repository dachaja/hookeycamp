package jasper.k.exercise;

public class Warmup1 {
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if (weekday == true) {
			if (vacation == true) {
				boolean sleepIn;
				return sleepIn = true;
			} else {
				boolean sleepIn;
				return sleepIn = false;

			}
		} else {
			if (vacation == true) {
				boolean sleepIn;
				return sleepIn = true;
			} else {
				boolean sleepIn;
				return sleepIn = true;
			}
		}
	}
	public static void main(String[] args) {
		boolean result = sleepIn(true, true);
		System.out.println("weekday=true, vacation=true " + result);
		result = sleepIn(true, false);
		System.out.println("weekday=true, vacation=false " + result);
		result = sleepIn(false, false);
		System.out.println("weekday=false, vacation=false " + result);
		result = sleepIn(false, true);
		System.out.println("weekday=false, vacation=true " + result);
		
	}
}
