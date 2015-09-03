package anna.p.exercise.ch6;

public class Exercise6_2 {
	public static void main(String[] args) {
		SutdaCard2 card1 = new SutdaCard2(3, false);
		SutdaCard2 card2 = new SutdaCard2();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard2 {
	private int num = 1;
	private boolean isKwang = true;
	
	public SutdaCard2() {
		//this.num = 1;
		//this.isKwang = true;
		
		this(1,true);
	}

	public SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
	
	public String info() {
		String temp = "";
		if(this.num > 0 && this.num < 11) {
			temp += this.num;
		}
		
		if(this.isKwang) {
			temp += "K";
		}
		return temp;
	}
	
}
