package jasper.k.ch7;

public class SutdaCard {
	private int num;
	private boolean isKwang;
	private String info;
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public SutdaCard() {
		this.num = 1;
		this.isKwang = true;
		
//		this(1,true);
	}
	public void setNum (int num){
		if (num >=1 && num <=10){
			this.num = num;
		}
	}
	public int getNum (){
		return num;
	}
	public void setIsKwang (boolean isKwang){
		this.isKwang = isKwang;
	}
	public boolean getIsKwang (){
		return isKwang;
	}
	public String info() {
		return null;
	}
		
	
}
