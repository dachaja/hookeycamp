package jasper.k.ch7;

public class SmartIntHolder {
	private int value;
	public  SmartIntHolder(int value){
		this.value = value;
	}
	public void setValue(int value){
		this.value = value;
	}
	public int getValue () {
		return value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = String.valueOf(this.value);
		return str;
	}
	

}