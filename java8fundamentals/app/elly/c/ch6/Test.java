package elly.c.ch6;

public class Test {
	public static void main(String[] args) {
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
		
		jack.count = Human.count +1;
		
//		Human.name = "Elly";
//		Human.gender = "Female";
		Human.count = Human.count +1;
		
		long population = Human.count;
		
		System.out.println(population);
	}
}
