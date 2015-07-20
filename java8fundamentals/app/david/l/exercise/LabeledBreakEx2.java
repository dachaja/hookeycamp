package david.l.exercise;

public class LabeledBreakEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		blockLabel:
		{
			int i = 10;
			if (i == 5) {
				break blockLabel; // Exits the block
			}
			
			if (i == 10) {
				System.out.println("i is not five");
			}
		}
	}

}
