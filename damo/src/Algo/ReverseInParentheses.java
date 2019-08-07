package Algo;

public class ReverseInParentheses {

	public static String reverseInParentheses1(String inputString) {
		
		char [] tempchar = new char[inputString.length()];
		
		for (int i = 0; i < inputString.length(); i++) {
			tempchar[i] = inputString.charAt(i);
		}
	
		
		return inputString;
	}
	
	public static void main(String[] args) {
		
		String inputString = "foo(bar(baz))blim";
		//rab Ãâ·Â 
		System.out.println(reverseInParentheses1(inputString));
	}

}
