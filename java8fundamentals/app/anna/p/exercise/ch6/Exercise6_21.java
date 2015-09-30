package anna.p.exercise.ch6;

class MyTv {
	boolean isPowerOn;
	int		channel;
	int		volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		//  if isPowerOn is true, change to false. is false then change to true.
		if(isPowerOn) isPowerOn = false;
		else isPowerOn = true;
	}
	void volumeUp() {
		// if volume is less than MAX_VOLUME, increase 1.
		if(volume < MAX_VOLUME) volume++;
	}
	void volumeDown() {
		// if volume is greater than MIN_VOLUME, decrease 1.
		if(volume > MIN_VOLUME) volume--;
	}
	void channelUp() {
		// channel is increased 1.
		// if channel is MAX_CHANNEL, move to MIN_CHANNEL.
		if(channel==MAX_CHANNEL) channel = MIN_CHANNEL;
		else channel++;
	}
	void channelDown() {
		// channel is decreased 1.
		// if channel is MIN_CHANNEL, move to MAX_CHANNEL.
		if(channel==MIN_CHANNEL) channel = MAX_CHANNEL;
		else channel--;
	}
}

public class Exercise6_21 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
	}
}
