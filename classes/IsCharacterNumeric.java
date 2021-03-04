package classes;

public class IsCharacterNumeric {

	public static void main(String[] args) {
		// check if the Character is all numeric
		System.out.println("---- "+ checkIfNumericChar("0"));
		System.out.println("---- "+ checkIfNumericChar("123"));
		System.out.println("---- "+ checkIfNumericChar("abcd"));
		System.out.println("---- "+ checkIfNumericChar("12ab"));
		System.out.println("---- "+ checkIfNumericChar("test123"));
		System.out.println("---- "+ checkIfNumericChar(""));
		System.out.println("---- "+ checkIfNumericChar(" "));
		System.out.println("---- "+ checkIfNumericChar("$$acdd"));
		System.out.println("---- "+ checkIfNumericChar("\u0967"));
		
	}

	public static boolean isEmpty(CharSequence cs) {
		return cs.length() == 0 || cs == null ; // this will return false
	}
	
	public static boolean checkIfNumericChar(CharSequence cs) {
		if(isEmpty(cs))
			return false;
		for(int i = 0;i <cs.length();i++) {
			if( !Character.isDigit(cs.charAt(i))) {
				return false ;
			}
		}
		
		return true;
	}
	
}
