package david.l.exercise.ch6;

public class TvTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1's channel is " + t1.channel + ".");
		System.out.println("t2's channel is " + t2.channel + ".");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1's channel is changed to 7.");
		
		System.out.println("t1's channel is " + t1.channel + ".");
		System.out.println("t2's channel is " + t2.channel + ".");
	}
}
	
