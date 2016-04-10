package elly.c.ch6;

public class ProductTest {
	
	public static void main(String[] args) {
		System.out.println("Product count: " +Product.count);
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1's serial no is " + p1.serialNo);
		System.out.println("p2's serial no is " + p2.serialNo);
		System.out.println("p3's serial no is " + p3.serialNo);
		System.out.println("Total product's count is " + Product.count + ".");
	}
}

class Product{
	static int count = 0; // class variable
	int serialNo; // instance variable
	
	{
		++count; // instance block
		serialNo = count;
	}
	
	// constructor
	public Product() {
		
	}
}