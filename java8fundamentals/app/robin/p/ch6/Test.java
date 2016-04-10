package robin.p.ch6;

import anna.p.exercise.ch6.InitTest;

public class Test {
public static void main(String[] args) {
	
	InitTest.z = 0;
	InitTest it = new InitTest();
	it.y = 8;
	
	Human anna = new Human();
	System.out.println(anna.name);
	System.out.println(anna.gender);
	
	anna.name = "Anna";
	anna.gender = "Female";
	anna.count = 1;
	
	System.out.println(anna.name);
	System.out.println(anna.gender);
	
	Human jack;
	jack = new Human();
	
	jack.count = Human.count + 1;
	
	//Human.name = "Elly";
	//Human.gender = " Female";
	Human.count = Human.count + 1;
	
	long population = Human.count;
	
	System.out.println(population);
	
	
	
}
}
