package jasper.k.ch8;

import java.util.*;
public class DFafdas {
	public static void main(String args[])
	  {
	    int[] solutionArray = { 1, 2, 3, 4, 5};

	    shuffleArray(solutionArray);
	    for (int i = 0; i < solutionArray.length; i++)
	    {
	      System.out.print(solutionArray + " ");
	    }
	    System.out.println();
	  }

	  static void shuffleArray(int[] ar)
	  {
	    Random rnd = new Random();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      int a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
	}
}
