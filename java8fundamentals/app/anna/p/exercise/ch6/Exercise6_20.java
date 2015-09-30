package anna.p.exercise.ch6;

import java.util.Arrays;
import java.util.Random;

public class Exercise6_20 {
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
		int[] betterResult = shuffleArray(original);
		System.out.println(Arrays.toString(betterResult));
	}
	
	private static int[] shuffle(int[] original) {
		int[] shuffle = new int[9];
		for(int i=0; i < original.length; i++) {
			boolean shuffled = true;
			while(shuffled) {
				int shuffledPosition = (int)(Math.random()*9);
				//System.out.println(shuffledPosition + "");
				if(shuffle[shuffledPosition] == 0){
					shuffle[shuffledPosition] = original[i];
					shuffled = false;
					break;
				} else if(i == original.length){
					shuffled = false;
					break;
				}
			}	
		}
		return shuffle;
	}
	
	private static int[] shuffleArray(int[] ar) {
		Random rnd = new Random();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i+1);
			// simple swap
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
		return ar;
	}
}
