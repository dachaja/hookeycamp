package anna.p.ch6;

public class Test {
	public static void main(String[] args) {
		//StaticTest.height = 100;
		StaticTest.width = 100;
		
		StaticTest st = new StaticTest();
		st.height = 100;
		
		System.out.println("height: " + st.height + " width: " + st.width);
		
		StaticTest st2 = new StaticTest();
		st2.height = 200;
		st2.width = 200;
		
		System.out.println("height: " + st2.height + " width: " + st2.width);
		
		System.out.println("height: " + st.height + " width: " + st.width);
		
		BakeryWebsite bw = new BakeryWebsite();
		AfterSchoolWebsite aw = new AfterSchoolWebsite();
		
		bw.move();
		aw.move();
		
		bw.login();
		aw.login();
		
		System.out.println(aw.copyright + ", " + bw.copyright);
		System.out.println(aw.copyright2 + ", " + bw.copyright2);
		
		aw.copyright = "google";
		System.out.println(aw.copyright + ", " + bw.copyright);
		
		aw.copyright2 = "hookey";
		System.out.println(aw.copyright2 + ", " + bw.copyright2);
		
		bw.register();
		aw.register();
		
	}
}
