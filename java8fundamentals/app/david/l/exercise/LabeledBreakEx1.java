package david.l.exercise;

public class LabeledBreakEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer: // Defines a label named outer
		for(int i=1; i <= 3; i++) { // 
			//outer: // Defines a label named outer	
			for(int j=1; j<=3; j++){
				System.out.print(i+""+j);
				if(i==j){
					break outer; // Exit the outer for loop
				}
				System.out.print("\t");
			}
			System.out.println();
		} // The outer label ends here
				

	}

}
