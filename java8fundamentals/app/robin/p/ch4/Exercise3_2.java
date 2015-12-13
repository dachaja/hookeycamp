package robin.p.ch4;

public class Exercise3_2 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples % 10 !=0) ?
				(numOfApples / sizeOfBucket ) + 1 : (numOfApples / sizeOfBucket );
		
		System.out.println("How many buckets do you need?" + numOfBucket);
		
		int numOfBanana = 4;
		int numOfdays = 10;
		int totalBananas = (numOfBanana * numOfdays);
		
		System.out.println("How many bananas did you eat?" + totalBananas );

	int num = 10;
	System.out.println( num == 0 ? "0" : (num>0 ? "양수" : "음수"));
		
		
	}
	


}
