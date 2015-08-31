package anna.p.exercise.ch7;

public class IntHolderWrapper3 {
	private final IntHolder valueHolder;
	
	public IntHolderWrapper3(int value) {
		this.valueHolder = new IntHolder(value);
	}
	
	public IntHolderWrapper3(IntHolder holder) {
		// Must make a copy of holder parameter
		this.valueHolder = new IntHolder(holder.getValue());
		//this.valueHolder = holder;
	}
}
