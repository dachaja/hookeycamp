package jasper.k.exercise;

import scala.collection.parallel.mutable.ParHashSetCombiner.AddingFlatHashTable;

public class Operator {
	public static void main(String[] args) {
//		int num1 = 1, num2 = 1;
//		
//		for (int i = 0; i < 10; i++) {
//			num1 = i;
//			System.out.println("num1++ " + num1++);
//			System.out.println("after num1++" + num1);
//		}
//		
//		for (int i = 0; i < 10; i++) {
//			num2 = i;
//			System.out.println("++num2 " + ++num2);
//			System.out.println("after num2++" + num2);
//		}
		additionOperator();
	}
	private static void additionOperator() {
		byte b1;
		byte b2 = 2;
		byte b3 = 3;
		b1 = (byte) (b2 + b3);
		b1 = (byte) ((byte) b2 + b3);
		b1 = 3 + 2;
		
		b1 = 2;
		b2 = 3;
		short s1 = 100;
		int i = 10;
		int j = 12;
		float f1 = 2.5F;
		double d1 = 20.0;
		
		b1 = 15 + 110;
		b1 = (byte) (127 + 100);
		
		System.out.println("b1 = " + b1); 
		
		int i1 = 10;
		i1 = i1++ + i1;
		System.out.println("i1 = " + i1);
		i1 = 10;
		i1 = ++i1 + i1++;
		System.out.println("i1 = " + i1);
		
		String str2 = "Hi";
		String str1 = i + j + str2;
		System.out.println("str1 = " + str1);
		
		String str3 = str1 + str1;
		System.out.println("str3 = " + str3);
	}
}
