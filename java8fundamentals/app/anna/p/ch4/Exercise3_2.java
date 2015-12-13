package anna.p.ch4;

public class Exercise3_2 {
	public static void main(String[] args) {
		int numOfApples = 123; 
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples % 10 != 0) ? 
				(numOfApples / sizeOfBucket) + 1 : (numOfApples / sizeOfBucket);
		
		System.out.println("How many buckets do you need? " + numOfBucket);
		
		// 하루에 먹는 총 바나나는 4개입니다. 총 10일동안 먹은 바나나의 갯수는 몇개일까요?
		int numOfbananasforOneday = 4;
		int numOfdays = 10;
		int totalBananas = 0;
		
		// 아래는 variable's name: num의 값에 따라 '양수', '음수', '0' 을 출력하는 코드이다.
		// Ternary Operator를 이용해서 알맞은 코드를 넣으시오.
		
		int num = 0;
		System.out.println( num == 0 ? "0" : (num > 0 ? "양수" : "음수") );
	}
}
