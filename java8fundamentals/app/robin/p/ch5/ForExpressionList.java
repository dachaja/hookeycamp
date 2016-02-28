package robin.p.ch5;

public class ForExpressionList {

	public static void main(String[] args) {
		// outer for - loop statement
		for(int i = 1 ; i<=9; i++) {
			//Inner for-loop statement
			for(int j=1;j<=9;j++) {
				System.out.print(i + "X" + j +"=" + i*j);
				//prints a tab after each column value
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
