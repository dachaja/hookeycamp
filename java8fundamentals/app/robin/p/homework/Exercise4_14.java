package robin.p.homework;
//1과 100사이에 값을 반복적으로 입력해서 컴퓨터가 생각한 것을 맞추면 끝남
public class Exercise4_14 {

	public static void main(String[] args){
	int answer = (int) ((Math.random() * 100) + 1); // 1-100까지 랜덤으로 수를 창조하는 
	int input = 0;
	int count = 0;
	
	java.util.Scanner s = new java.util.Scanner(System.in);
	
	do {
		count ++;
		System.out.print("1과 100사이의 값을 입력하세요 :");
		input = s.nextInt();
			
		if(input > answer) {
			System.out.println("더 작은 수를 입력하시오.");
		} else if(input < answer) {
			System.out.println("더 큰수를 입력하시오.");
		} else if(input == answer) {
			System.out.println("맞췄습니다.");
			System.out.println("시도 회수는 " + count + "번 입니다. ");
			break;
		}
			
	
	} while(true);
	
	}
}

