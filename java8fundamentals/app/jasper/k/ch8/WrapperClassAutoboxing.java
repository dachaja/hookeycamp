package jasper.k.ch8;

public class WrapperClassAutoboxing {
	public static Integer add(Integer a, Integer b) {
		int aValue = a.intValue();
		int bValue = b.intValue();
		int resultValue = aValue + bValue;
		Integer result = new Integer(resultValue);
	
		return result;
	}
	public static void main(String[] args) {
		int iValue = 200;
		int jValue = 300;
		int kValue;
		
		Integer i = Integer.valueOf(iValue);
//		Integer i = iValue;
		Integer j = Integer.valueOf(jValue);
		
		Integer k = WrapperClassAutoboxing.add(i, j);
		
		kValue = k.intValue();
		
		System.out.println(iValue + " + " + jValue + " = " + kValue);
		Integer n = 200;
		int a = n;
		
		
		Integer n1 = null;
		int a1 = n1;
		
		System.out.println(a);
	}
}
