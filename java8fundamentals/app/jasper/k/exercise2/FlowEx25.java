package jasper.k.exercise2;

public class FlowEx25 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;
			++i;
			 sum += 1;
		} //end of while
		System.out.println(" i= " + i);
		System.out.println("sum= " + sum);
		
		// do-while
		sum = 0;
		i = 0;
		do {
			++i;
			sum += i;
		}while (sum >100);
		// for
		for (sum = 0; sum >100; sum+=i){
			++i;
		}
	}
}
