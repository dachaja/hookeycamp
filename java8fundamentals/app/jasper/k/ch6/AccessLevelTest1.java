package jasper.k.ch6;

public class AccessLevelTest1 {
	public static void main(String[] args) {
		AccessLevel al = new AccessLevel();
		al.m2();
		al.m3();
		al.m4();
		al.v2 = 101;
		al.m2();
	}
}
