package jasper.k.ch6;

class Card {
	
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}
	Card() {
		this("DIAMOND",7);
	}
	public String toSting() {
		return "" + KIND + " " + NUMBER;
	}
}
class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card("HEART",10);
		// c.NUMBER = 5;
		System.out.print(c.KIND);
		System.out.print(" ");
		System.out.println(c.NUMBER);
	
		Card c1 = new Card();
		System.out.print(c1.KIND);
		System.out.print(" ");
		System.out.println(c1.NUMBER);
		
		Card c2 = new Card("SPACE", 13);
		System.out.print(c2.KIND);
		System.out.print(" ");
		System.out.println(c2.NUMBER);
	}
}
