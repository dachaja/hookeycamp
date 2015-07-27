package jasper.k.homework;

public class Exercise3_2 {
	public static void main(String[] args) {
		int numOfApples = 4951;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples/sizeOfBucket;
		if (numOfApples%sizeOfBucket>0)
			numOfBucket++;
// int numOfBucket = numOfApples%sizeOfBucket < 0 ? (numOfApples/sizeOfBucket) +1
// :(numOfApples/sizeOfBucket);
		
		System.out.println("사과의 개수 : " + numOfApples);
		System.out.println("바구니에 사과가 들어갈수 잇는 수 : "+sizeOfBucket );
		System.out.println("필요한 바구니의 수 : " +numOfBucket);
	}
}
