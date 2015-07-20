package david.l.exercise;

public class LabeledBreakEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lab1:
		{
			int i = 10;
			if(i == 10)
				break lab1;  //ok. lab1 can be used here
		}
	
		lab2:
		{
		int i = 10;
		if(i == 10)
			// A compile-time error. lab1 cannot be used here because this block is not
			// associated with lab1 label. We can use only lab2 in this block
			break lab2;
		}
	}
}


