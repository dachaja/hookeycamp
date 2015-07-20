package jasper.k.exercise2;

public class ContinueEx1 {
	public static void main(String[] args) {
		outer :
		for (int i = 1; i <=3 ; i ++) {
			for (int j = 1; j <= 3;j++){
				System.out.print(i +""+j);
				System.out.print("\t");
				if (i==j) {
					System.out.println(); // print a new line
					continue outer; // continue the outer loop
				}
			}
		}
	}
}
