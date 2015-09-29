package jasper.k.ch8;

import java.util.ArrayList;
import java.util.List;

public class OverloadingMethod {
	public static void test(Long iObject) {
		System.out.println("Long=" + iObject);
	}
	public static void test(Object iValue) {
		System.out.println("Object ="+iValue);
	}
	public static int test(Integer oValue){
		return 1;
	}
	public static double test(Double dValue){
		return 1.00;
	}
	public static void main(String[] args) {
		test(101l);
		test(new Integer(101));
	
		
		Integer a = 100;
		Integer b = 100;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("a>b: " +( a>b));
		System.out.println("a<b: " + (a<b));
		System.out.println("a<=b: " + (a<=b));
		System.out.println("a>=b: " + (a>=b));
		
		Integer aaa =100;
		Integer bbb = 100;
		Integer ccc = 505;
		Integer ddd = 505;
		
		System.out.println(aaa==bbb);
		System.out.println(aaa==ccc);
		System.out.println(ccc==ddd);
		
//		List list = new ArrayList();
		List<Integer> list = new ArrayList<>();
//		list.add(new Integer(101));
		list.add(101);
		Integer a46 = (Integer)list.get(0);
		int aValue  = a46.intValue();
		
	}
}
