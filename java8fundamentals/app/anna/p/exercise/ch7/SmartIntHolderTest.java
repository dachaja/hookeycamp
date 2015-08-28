package anna.p.exercise.ch7;

public class SmartIntHolderTest {
	public static void main(String[] args) {
		SmartIntHolder intHolder = new SmartIntHolder(234);
		String intHolderStr = intHolder.toString();
		System.out.println(intHolderStr);
		
		intHolder.setValue(8976);
		intHolderStr = intHolder.toString();
		System.out.println(intHolderStr);
	}
}
