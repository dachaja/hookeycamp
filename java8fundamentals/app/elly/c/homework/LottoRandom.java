package elly.c.homework;

public class LottoRandom {
	public static void main(String[] args) {

		int[] lottoNumber = new int[7];  
	    {  
	        lottoNumber[0] = (int) ((49 * Math.random()) + 1);  
	        lottoNumber[1] = (int) ((49 * Math.random()) + 1);  
	        lottoNumber[2] = (int) ((49 * Math.random()) + 1);  
	        lottoNumber[3] = (int) ((49 * Math.random()) + 1);  
	        lottoNumber[4] = (int) ((49 * Math.random()) + 1);  
	        lottoNumber[5] = (int) ((49 * Math.random()) + 1); 
	        lottoNumber[6] = (int) ((49 * Math.random()) + 1);
	    }  

	    System.out.println("Lottery Numbers: ");


	    {  
	        System.out.print(lottoNumber[0] + " " );
	        System.out.print(lottoNumber[1] + " " );
	        System.out.print(lottoNumber[2] + " " );
	        System.out.print(lottoNumber[3] + " " );
	        System.out.print(lottoNumber[4] + " " );
	        System.out.print(lottoNumber[5] + " " );
	        System.out.print(lottoNumber[6] + " " );
	    }  
}
}
