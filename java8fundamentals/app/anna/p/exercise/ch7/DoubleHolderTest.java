package anna.p.exercise.ch7;

public class DoubleHolderTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		DoubleHolder dh = new DoubleHolder(100.00);
		DoubleHolder dhClone = (DoubleHolder)dh.clone();
		
		System.out.println("Original: " + dh.getValue());
		System.out.println("Clone: " + dhClone.getValue());
		
		dh.setValue(200.00);
		dhClone.setValue(400.00);
		
		System.out.println("Original: " + dh.getValue());
		System.out.println("Clone: " + dhClone.getValue());
	}
}
