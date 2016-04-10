package robin.p.ch6;

public class Tvtest {
public static void main(String[] args) {
	Tv t;
	t = new Tv();
	t.power = true;
	t.channel = 7;
	t.channelDown();
	System.out.println("Current channel is" + t.channel + ".");
	
	t.powerOnOff();
	System.out.println("Power is" + t.power);
}
}

class Tv {
	String color; // instance variables
	boolean power;
	int channel;
	
	//Methods
	void powerOnOff() {
		power = !power;
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
}
