package robin.p.ch6;

public class FieldAccessTest {

	public static void main(String[] args) {
		// Create an instance of Human class, class name is Jack.
		Human jack = new Human();
		
		//increae count by one
		Human.count++;
		
		// Assign values to name = Jack parker and gender = Male
		
		jack.name = "Jack Park";
		jack.gender = "Male";
		
		//Read and print the value of name, gender and count;
		String jackName = jack.name;
		String jackGender = jack.gender;
		long population = Human.count;
		
		System.out.println("Name:  "+ jackName);
		System.out.println("Gender:  "+ jackGender);
		System.out.println("Population: "+ population);
		
		//Change the name
		jack.name = "Anna Jo";
		
		// Read and print the changed name
		String changeName = jack.name;
		System.out.println("Change Name: " + changeName);
		
	
	}
}
