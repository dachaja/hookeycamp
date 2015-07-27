package david.l.exercise.ch6;

class Tv {
	// Instance variables
	String color;
	boolean power;
	int channel;
	
	//Methods
	void power() {
		power = !power;
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
}
class TvTest{
	public static void main(String[] args){
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("Current channel is " + t.channel + ".");
	}
}
