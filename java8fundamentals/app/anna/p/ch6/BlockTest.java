package anna.p.ch6;

public class BlockTest {
	static {
		System.out.println("static { }"); // class initialization block
	}
	{
		System.out.println("{ }"); // instance initialization block
	}
	
	public BlockTest() {
		System.out.println("Constructor.");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
	}
}
