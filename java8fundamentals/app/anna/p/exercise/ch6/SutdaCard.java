package anna.p.exercise.ch6;

public class SutdaCard {
	private int num = 1;
	private boolean isKwang = true;
	
	public SutdaCard(int num, boolean isKwang) {
		this.setNum(num);
		this.setKwang(isKwang);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num > 0 && num <= 10) {
			this.num = num;
		}
	}

	public boolean isKwang() {
		return isKwang;
	}

	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
	public String info() {
		String info = "";
		if(num > 0 && num <= 10) {
			info = num + "";
		}
		
		if(isKwang) {
			info += "K";
		}
		
		return info;
	}
	
}
