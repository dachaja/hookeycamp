package jasper.k.exercise2;

public class BreakEx4 {
	public static void main(String[] args) {
		lab1:
		{
			int i = 10;
			if ( i == 10)
				break lab1;
		}
		lab2 :
		{
			int i = 10;
			if (i == 10)
				// A compile-time error. lab1 cannot be used here because this block is not
				// associated with lab1 label. We can use only lab2 in this block
				break lab2;
		}
	}
}
