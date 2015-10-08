package jasper.k.ch9;

public class Exercise6_23 {
	public int max(int[] ary) {
		if (ary == null || ary.length == 0){
			return -999999;
		}
		int max = ary[0];
		for (int i : ary) {
			if(i > max) {
				max = i;
				
		}	
			}
		return max;
	}
}
