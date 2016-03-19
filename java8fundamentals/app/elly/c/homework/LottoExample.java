package elly.c.homework;

public class LottoExample {
	public static void main(String[] args) {
		int[] lottoNumber = new int[6];  
	    {  
	        lottoNumber[0] = (int) ((47 * Math.random()) + 1);  
	        lottoNumber[1] = (int) ((47 * Math.random()) + 1);  
	        lottoNumber[2] = (int) ((47 * Math.random()) + 1);  
	        lottoNumber[3] = (int) ((47 * Math.random()) + 1);  
	        lottoNumber[4] = (int) ((47 * Math.random()) + 1);  
	        lottoNumber[5] = (int) ((27 * Math.random()) + 1);  
	    }  

	    System.out.println("Lottery Numbers: ");

	    for(int i=0; i<1; i++)  
	    {  
	        System.out.print(lottoNumber[0] + " " );
	        System.out.print(lottoNumber[1] + " " );
	        System.out.print(lottoNumber[2] + " " );
	        System.out.print(lottoNumber[3] + " " );
	        System.out.print(lottoNumber[4] + " " );
	        System.out.print("MEGA:(" + lottoNumber[5] + ")");
	    }  

	}  

	
}
