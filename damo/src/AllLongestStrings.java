
public class AllLongestStrings {

	
	public static String[] allLongestStrings1(String[] inputArray) {
		

		int[] templength = new int[inputArray.length];
		
	/*
	 * �� String�� ���̰��� ��� �迭�� ����ϴ�. 
	 */	
		for (int i = 0; i < templength.length; i++) {
			templength[i] = inputArray[i].length();
		}

	/*
	 * templength������ �ִ��� ���մϴ�.  	
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
	 * �ִ��� �迭�� tempString�� ����ϴ�.
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
