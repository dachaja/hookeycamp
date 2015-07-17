package jasper.k.exercise;

public class FlowEx19 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i =0; i <1000000000; i++) {
			for (int e =0; e <1000000000; e++){
				for (int a =0; a <1000000000; a++){
					for (int q =0; q <1000000000; q++){
						;
					}
				}
			}
		}

		long endTime = System.currentTimeMillis();
		
		System.out.println("Start Time : " + startTime);
		System.out.println("End Time : " + endTime);
		System.out.println("Elapsed Time : " + (endTime - startTime));
		
	}
}
