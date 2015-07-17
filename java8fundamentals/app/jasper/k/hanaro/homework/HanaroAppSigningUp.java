package jasper.k.hanaro.homework;

import java.util.Scanner;

public class HanaroAppSigningUp {
	public static void main(String [] args)
	   {  
		String userPassWord , userEmail , yesOrNo , certifiNum; 
		Scanner signUp = new Scanner(System.in);
		System.out.println("Write your Email");
		userEmail = signUp.next();
		System.out.println("Write your PassWord");
		userPassWord = signUp.next();
		System.out.print("'"+userEmail+"'");
		System.out.print( " is your Email?");
		System.out.println(" Write 'Yes' or 'NO'");
		yesOrNo = signUp.next();
		System.out.println(yesOrNo);
		
		switch (yesOrNo) {
			case "Yes" :
			System.out.println("Certification Number will send to your Email");
			break;
			case "No" :
			System.out.println("저의 한계.... goto line 10");
			break;
			default :
			System.out.println("Try Again");
		}
		char ranNum1, ranNum2, ranNum3,ranNum4, ranNum5, ranNum6;
		ranNum1 = (char)(Math.random() * 10);
		ranNum2 = (char)(Math.random() * 10);
		ranNum3 = (char)(Math.random() * 10);
		ranNum4 = (char)(Math.random() * 10);
		ranNum5 = (char)(Math.random() * 10);
		ranNum6 = (char)(Math.random() * 10);
		char ranAlf1,ranAlf2;
		ranAlf1 = (char)(Math.random() * 21 + 41);
		ranAlf2 = (char)(Math.random() * 21 + 41);
		int ranNUm1 = (int)ranNum1;
		System.out.println("teacher how to change ranNum1 to String?");
		System.out.println(ranNUm1+" "+ " "+ ranNum2 +" "+ranNum3+" "
				+ranNum4 +" "+ranNum5 +" "+ranNum6 +" "+ranAlf1 +" "+ranAlf2);
		
		System.out.println("이메일 보내기는 모르곘어요");
		certifiNum = signUp.next();
		System.out.println(certifiNum);
		System.out.println("여기또한 저의 한계...");
		
	   }
		
}
