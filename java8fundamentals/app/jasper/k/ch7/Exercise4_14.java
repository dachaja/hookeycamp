package jasper.k.ch7;

import java.util.Scanner;

public class Exercise4_14 {
	public static void main(String[] args) {
		int answer = (int) (Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt();
			if (input > answer ){
				System.out.println("더 작은수를 입력하세요");
			}else if ( input < answer) {
				System.out.println("더 큰수를 입력하세요");
			}else if ( input == answer) {
				System.out.println("맞췄습니다");
				System.out.println("시도횠수는 "+count+"번 입니다");
				break;
			}
		}while(true);
	}
}
