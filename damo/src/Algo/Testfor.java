package Algo;

class Test{
	
	public boolean test(String[] abc) {
		
		
		
		for(int i = 0 ; i < abc.length ; i++) {
			
			if(i ==100) {
				return false;
			}
			
		}
		
		return true;
	}
}

public class Testfor {

	public static void main(String[] args) {

		String[] abc = {"a","b","c","d","e","f","g",};
		
		Test test = new Test();
		
		System.out.println(test.test(abc));
		
	}

}
