package jasper.k.exercise;

public class IfElseEx3 {
	public static void main(String[] args) {
		int num = 1; // scope from line 6 to line22
		int num2 = 50; // scope from line 7 to line 22
		int num3 = 10; // scope from line 8 to line 22
		
		if(num > 50) {
			int num4 = 10; // scope from line 11 to line 16
			
			if (num2<30) {
				num3 += 130;
			} else {
				num3 -= 130;
			}
			
			if (num4 == 10)
				num4++;
			else num4--;
			
			num4 = (num4==10 ? num4++ : num4--);
			
		} else { 
			num3 *=200;
		}
		System.out.println(" num = " + num);
		System.out.println(" num2 = " + num2);
		System.out.println(" num3 = " + num3);
	}
}