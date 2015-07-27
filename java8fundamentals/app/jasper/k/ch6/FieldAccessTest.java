package jasper.k.ch6;

public class FieldAccessTest {
	public static void main(String[] args) {
		// Create an instance of Human class
		Human jack = new Human();
		Human john = jack;
		
		// Increase count by one
		Human.count++;
		
		// Assign value to name and gender;
		jack.name = "Jack Parker";
		System.out.println("***John.name : " + john.name);
		jack.gender = "Male";
//		Human.gender;
		// Read and print the values of name, gender and count
		String jackName = jack.name;
		String jackGender = jack.gender;
		long population = Human.count;
		
		Human.count++;
		population = Human.count;
		System.out.println("Population : " + population);
		
		System.out.println("Name : " + jackName);
		System.out.println("Gender: " + jackGender);
		System.out.println("Population : " + population);
		
		// Change the name
		jack.name = "Jackie Parker";
		System.out.println("***John.name : " + john.name);
		
		System.out.println("jackName : " + jackName);
		
		// Read and print the changed name
		String changedName = jack.name;
		System.out.println("Changed name :  "  + changedName);
	}
}
