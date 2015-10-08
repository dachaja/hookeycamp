package jasper.k.ch9;

public class Exercise6_24 {
	public static int abs(int value){
		if(value < 0) value = Math.abs(value);
		return value;
	}
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"'s Absolute is "+abs(value));
		value = -10;
		System.out.println(value+"'s Absolute is "+abs(value));
	}
}
