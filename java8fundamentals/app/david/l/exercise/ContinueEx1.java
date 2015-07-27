package david.l.exercise;

public class ContinueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer: // The label "outer" starts here
			for(int i =1; i <= 3; i++){
				for(int j =1; j <= 3; j++){
				System.out.print(i + "" + j);
				System.out.print("\t");
				if (i == j) {
					System.out.println(); // Print a new line
					continue outer; // Continue the outer loop
				}
			}
	} // The label "outer" ends here
	}
}
