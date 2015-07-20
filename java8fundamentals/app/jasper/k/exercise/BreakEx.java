package jasper.k.exercise;

public class BreakEx {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i ++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print( i + ""+ j);
				if ( i == j) {
					break; 	// Exit the inner for loop
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
