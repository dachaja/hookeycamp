package robin.p.ch4;

public class incrementOperator {
	public static void main(String[] args) {
		int i = 100;
		i = i + 1;
		i += 1;
		i++;
		++i;
		// i = 100
		//3 + 3 + (++i); = 3 + 3 + 101
		//3 + 3 + (i++); = 3 + 3 + 100
		//i + 5 = 106 + 5;
		i = 100;
		int j = 50;
		System.out.println("*" + i);
		j = i++ +15;
		System.out.println(j);
		System.out.println("*" + i);
		i = 100;
		j = ++i +15;
		System.out.println(j);
		
		// Decrement (--) Operator
		i = 15;
		j = 16;
		i--; // 14
		--i; // 13
		i = 10;
		j = i-- + 10; // assigns 20 to j
		i = 10;
		j = --i + 10; // assings 19 to j
		 
		
		
}

}
