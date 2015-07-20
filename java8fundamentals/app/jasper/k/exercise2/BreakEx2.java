package jasper.k.exercise2;

public class BreakEx2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++ ) {
			outer : // Defines a label named outer
			for(int j =1; j <=3; j++) {
				System.out.print(i + "" + j);
				if (i ==j) {
					break outer;	// Exit the outer for loop
				}
				System.out.print("\t");
			}
			System.out.println();
		}	// The outer label ends here
	}
	
}
