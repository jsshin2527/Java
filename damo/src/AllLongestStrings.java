
public class AllLongestStrings {

	
	public static String[] allLongestStrings1(String[] inputArray) {
		

		int[] templength = new int[inputArray.length];
		
	/*
	 * 각 String의 길이값을 얻어 배열에 담습니다. 
	 */	
		for (int i = 0; i < templength.length; i++) {
			templength[i] = inputArray[i].length();
		}

	/*
	 * templength길이의 최댓값을 구합니다.  	
	 */	
		int max = templength[0];
		int test =0;
		for (int i = 1; i < templength.length; i++) {
			test = templength[i];
			if(max < test) {
				max = test;
			}
			
		}
		int whiletest1 = 0;
		int whiletest2 = 0;		
		int counting = 0;
		int[] index = new int[templength.length];		
		while(whiletest1<templength.length) {
			if(max == templength[whiletest1]) {
				index[whiletest2] = whiletest1;
				whiletest2++;
				counting++;
			}
			whiletest1++;
		}
	/*
	 * 최댓값은 배열을 tempString에 담습니다.
	 */
		String[] tempString = new String[counting];
		
		for (int i = 0; i < tempString.length; i++) {
			tempString[i] = inputArray[index[i]];
		}
		return tempString;
	}
	public static void main(String[] args) {
		
		
		String[] inputArray = {"aba", 
							   "aa", 
							   "ad", 
							   "vcd", 
							   "aba"};
		String[] test =allLongestStrings1(inputArray);
		
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}

	}

}
