package anna.p.exercise.ch8;

import java.util.ArrayList;
import java.util.List;

public class OverloadedMethod {
	public static void test(Long lObject) {
		System.out.println("Long=" + lObject);
	}
	public static void test(Object iValue) {
		System.out.println("Obejct=" + iValue);
	}
	
	public static void main(String[] args) {
		test(101);
		test(new Integer(101));
		
		Integer a = 100;
		Integer b = 100;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("a > b " + (a>b));
		System.out.println("a >= b " + (a>=b));
		System.out.println("a < b " + (a<b));
		System.out.println("a <= b " + (a<=b));
		
		List<Integer> list = new ArrayList<>();
		list.add(101);
		int aValue = list.get(0);
		
	}
}
