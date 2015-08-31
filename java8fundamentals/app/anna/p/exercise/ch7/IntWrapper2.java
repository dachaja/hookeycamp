package anna.p.exercise.ch7;

public class IntWrapper2 {
	private final int value;
	private int halfValue = Integer.MAX_VALUE;
	
	public IntWrapper2(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getHalfValue() {
		if(this.halfValue == Integer.MAX_VALUE) {
			this.halfValue = this.value / 2;
		}
		return this.halfValue;
	}
}
