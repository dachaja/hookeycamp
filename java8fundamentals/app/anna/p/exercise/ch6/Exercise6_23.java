package anna.p.exercise.ch6;

import java.util.Arrays;

public class Exercise6_23 {
	/*max thread*/
	public static int max(int[] arr) {
		if(arr == null || arr.length == 0) { return -999999; }
		int max = arr[0];
		for (int i : arr) {
			if(i > max) {
				max = i;
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = i;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.println("Max value: " + max(data));
		System.out.println("Max value: " + max(null));
		System.out.println("Max value: " + max(new int[]{}));
	}
}
