package robin.p.ch5;

public class PrintMatrix {
public static void main(String[] args) {
	for(int i=1; i<=3; i++) {
		for(int j=1; j<=3 ; j++) {
			System.out.print(i+","+j);
			
			//print a tab, except for the last number in a row
			if(j<3) {
				System.out.print("\t");
			}
		}
		//print a new line, except after the last line
		if(i<3) {
			System.out.println();
		} else if(i==3) {
			System.out.println();
			System.out.println("END");
		}
		//change
		
	}
	
}
}
