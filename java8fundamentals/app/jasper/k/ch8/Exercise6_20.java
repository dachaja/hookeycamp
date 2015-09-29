package jasper.k.ch8;

import java.util.*;

public class Exercise6_20 {

//	static int c = 0;
	private static int[] shuffle(int[] a){
		for(int b = 0; b < a.length ; b++){
			a[b] = (int)(Math.random()*9)+1;
//			for(c = 0;;c++){
//				a[b] = (int)(Math.random()*9)+1;
//			}
		}
		return a;
	}
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}

}
