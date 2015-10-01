package jasper.k.ch9;

public class Exercise6_22 {
	public static boolean isNumber(String str){
		if (str == null || str == ""){
			return false;
		}
		char[] charArray = str.toCharArray();
		for(int i = 0; i < charArray.length; i++){
//			System.out.println(charArray[i]);
			if(!(charArray[i]>48 && charArray[i] <57)){
//				System.out.println(charArray[i]);
				return false;		
			}
				
		}
		return true;
	}
	public static void main(String[] args) {
		String str="123";
		System.out.println(str+"is number?"+isNumber(str));
		str="123o";
		System.out.println(str+"is number?"+isNumber(str));
	}
}
