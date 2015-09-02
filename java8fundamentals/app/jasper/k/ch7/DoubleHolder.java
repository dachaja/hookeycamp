package jasper.k.ch7;

public class DoubleHolder implements Cloneable{
private double value;
public DoubleHolder(double value) {
	this.value = value;
}
public void setValue(double value) {
	this.value = value;
}
public double getValue(){
	return this.value;
}
public Object clone() {
	DoubleHolder copy = null;
	try{
		copy = (DoubleHolder) super.clone();
		
	}
	catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	return copy;
}
}
