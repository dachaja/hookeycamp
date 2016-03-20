package robin.p.homework;

public class Exercise4_12 {
	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			for(int j=2; j<=9; j++) {
				int sum=i*j;
				System.out.print(j+"*"+i+"="+sum);
				if(j<9) {
					System.out.print("\t");
				}
			}
			
	 	if(i<3) {
				System.out.println();
			} else if(i==3) {
				System.out.println();
				
			}
		}
	}
}
