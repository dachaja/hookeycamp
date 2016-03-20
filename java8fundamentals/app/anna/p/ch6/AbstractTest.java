package anna.p.ch6;

abstract class AbstractTest {
	static String copyright = "robin";
	
	abstract void move();
	abstract void login();
	void register() {
		System.out.println("Register");
	}
	abstract void logout();
//	abstract void run() {
//		
//	}
}
