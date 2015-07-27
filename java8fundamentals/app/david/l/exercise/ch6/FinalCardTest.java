package david.l.exercise.ch6;

class Card {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card(){
		this("HEART",1);
	}
	
	public String toString(){
		return "" + KIND + " " + NUMBER;
	}
}

class FinalCardTest {
	public static void main(String[] args){
		Card c = new Card("HEART", 10);
		// c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		
		Card c2 = new Card();
		System.out.println(c2.KIND);
		System.out.println(c2.NUMBER);
		
		Card c3 = new Card();
		System.out.println(c3.KIND);
		System.out.println(c3.NUMBER);
	}
}
