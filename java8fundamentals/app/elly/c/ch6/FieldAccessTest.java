package elly.c.ch6;

public class FieldAccessTest {
	public static void main(String[] args) {
		// Create an instance of Human class, class name is jack
		Human jack = new Human();
	
		//Increase count by one
		Human.count++;
		
		//Assign values to name = Jack Parker and gender = Male
		jack.name = "Jack Parker";
		jack.gender = "Male";
		
		// Read and print the values of name, gender and count;
		String jackName = jack.name;
		String jackGender = jack.gender;
		long population = Human.count;
		
		System.out.println("Name: " + jackName);
		System.out.println("Gender: " + jackGender);
		System.out.println("Population: " + population);
		
		// Change the name
		jack.name = "Elly Choi";
		
		// Read and print the changed name
		String changeName = jack.name;
		System.out.println("Changed Name: " + changeName);
	}
}
