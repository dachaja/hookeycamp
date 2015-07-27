package jasper.k.ch6;

public class BlockTest {
	static {
		System.out.println("static { } "); // class initialization block 1
	}
	{
		System.out.println(" { } "); // instance initialization
	}
	
	public BlockTest() {
		System.out.println("Constructor.");
	}
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockYest();");
		BlockTest bt2 = bt;		
	}
}
