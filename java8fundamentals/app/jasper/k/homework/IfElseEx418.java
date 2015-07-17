package jasper.k.homework;

public class IfElseEx418 {
	public static void main(String[] args) {
		String str = "No";
		if (str == "yes"){
		}
	}
}

// 1 + (1+2) + (1+2+3) + (1+2+3+4)
// 1 + (1+2) + (3+3) + (6+4) + (10+5)....
// num = 1;
// prevSum = 0;
// prevSum = prevSum + num++;
// prevSum + (prevSum + num++) + ....
// totalSum = (1 + 0) + (1+2) + (3 + 3) + (6 + 4) + (10 + 5)....
