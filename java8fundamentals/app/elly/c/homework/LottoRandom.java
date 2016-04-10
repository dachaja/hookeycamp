package elly.c.homework;

public class LottoRandom {
	public static void main(String[] args) {

		int[] lottoNumber = new int[7];  
	    {  
	    		for (int i = 0; i < lottoNumber.length; i++) {
	    			int randomN = (int)((49 * Math.random()) + 1);
	    			
	    			lottoNumber[i] = getRandomN(lottoNumber); 
				}
	    }  

	    System.out.println("Lottery Numbers: ");


	    {  
	    		for (int i = 0; i < lottoNumber.length; i++) {
	    			System.out.print(lottoNumber[i] + " " );
				}
	    }  
	}
	
	public static int getRandomN(int[] curr) {
		int randomN = (int)((49 * Math.random()) + 1);
		
		for (int i = 0; i < curr.length; i++) {
			if(curr[i] == randomN) {
//				while (true) {
//					
//					
//				}
			}
		}
		return randomN;
	}
}
