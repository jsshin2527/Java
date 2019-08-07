package Algo;

public class commonCharacterCount {
	
	
	public static int commonCharacterCounttest(String s1,String s2) {
		
		int answer = 0;
		
		char[] s1charter = new char[s1.length()];
		char[] s2charter = new char[s2.length()];
		
		for (int i = 0; i < s1.length(); i++) {
			s1charter[i] = s1.charAt(i);
			s2charter[i] = s2.charAt(i);
		}
		int pointcheck = 0;
		int nextcheck = 0;
		
		while(pointcheck < s1.length()) {
			
			if(s1charter[pointcheck] == s2charter[nextcheck]) {
				s2charter[nextcheck] = '0';
				pointcheck++;
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {

		String s1 = "aabcc";
		String s2 = "adcaa";
				
		System.out.println(commonCharacterCounttest(s1,s2));
		//System.out.println(s2.replace(s2.charAt(2),'0'));
		
	}

}
