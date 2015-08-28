package anna.p.exercise.ch7;

public class DoubleHolder implements Cloneable{
	private double value;
	
	public DoubleHolder(double value) {
		this.value = value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return this.value;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		DoubleHolder copy = null;
		copy = (DoubleHolder) super.clone();
		return copy;
	}
}
