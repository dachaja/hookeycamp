package jasper.k.exercise;

public class ForEachEx1 {
	public static void main(String[] args) {
		int[] numList = {10,20,30,40};
		for(int num : numList) {
			System.out.println(num);
		}
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		for(int i=0; i<=3; i++) {
			if(num1==10)
				System.out.println(num1);
			else if(num2==20)
				System.out.println(num2);
			else if(num3==30)
				System.out.println(num3);
			else if(num4==40)
				System.out.println(num4);
		}
	}
}
