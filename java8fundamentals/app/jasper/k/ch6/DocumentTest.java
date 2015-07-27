package jasper.k.ch6;

class Document {
	static int count = 0;
	String name;
	
	public Document() {
		this("NoName" + ++count);
	}

	public Document(String name) {
		this.name = name;
		System.out.println("Document " + this.name + " is created.");
		
	}
}
public class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("java.txt");
		Document d3 = new Document();
		Document d4 = new Document();
}
}
