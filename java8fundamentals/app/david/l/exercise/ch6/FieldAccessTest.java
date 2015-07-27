package david.l.exercise.ch6;

class FieldAccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an instance of Human class
		Human jack = new Human();
		
		// Increase count by one
		Human.count++;
		
		// Assign values to name and gender
		jack.name = "Jack Parker";
		jack.gender = "Male";
		//Human.gender = "Male";
		
		String jackName = jack.name;
		String jackGender = jack.gender;
		long population = Human.count;
		
		Human.count++;
		population = Human.count;
		System.out.println("population : " + population);
		
		System.out.println("Name: " + jackName);
		System.out.println("Gender: " + jackGender);
		System.out.println("Population: " + population);
		
		// Change the name
		jack.name = "Jakie Parker";
		
		// Read and print the changed name
		String changedName = jack.name;
		System.out.println("Changed Name: " + changedName);
	}
}
