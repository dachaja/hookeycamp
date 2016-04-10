package robin.p.ch6;

public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card width = " + Card.width);
		System.out.println("Card height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Space";
		c2.number = 4;
		
		System.out.println("c1 is " + c1.kind + "," + c1.number + " and size is (" + c1.width + "," + c1.height + ")");
		System.out.println("c2 is " + c2.kind + "," + c2.number + " and size is (" + c2.width + "," + c2.height + ")");
		System.out.println("Change width and height to 50, 80");
		
		c1.width= 50;
		c1.height = 80;
		
		System.out.println("c1 is " + c1.kind + "," + c1.number + " and size is (" + c1.width + "," + c1.height + ")");
		System.out.println("c2 is " + c2.kind + "," + c2.number + " and size is (" + c2.width + "," + c2.height + ")");
		
	}
}


class Card {
	String kind; // instant variable
	int number; // instance variable
	static int width = 100;  // class variable
	static int height = 250; // class variable
	 
	
}