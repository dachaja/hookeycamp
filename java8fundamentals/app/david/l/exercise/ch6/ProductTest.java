package david.l.exercise.ch6;

class Product {
	static int count = 0;
	int serialNo;
	
	{
			++count;
			serialNo = count;
	}
	public Product() {}
}

class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1's serial no is " + p1.serialNo);
		System.out.println("p2's serial no is " + p2.serialNo);
		System.out.println("p3's serial no is " + p3.serialNo);
		System.out.println("Total product's count is " + Product.count + ".");
	}

}
