package Algo;

class AlmostAnswer {

	public boolean almost(int[] sequence) {
		
		boolean check = false;
	
		int i = 1;
		int j = i+1;
		int removecounting = 0;
		
		if(sequence.length <= 3) {
			for(int a = 0 ; a < sequence.length ; a++) {
				
				if(sequence[a+1] - sequence[a] <= 0) {
					
				}
				
			}
				
		}
		
		while( j < sequence.length -1) {
			
			if(sequence[i] >= sequence[j]) {
					j++;
					removecounting++;
				if(sequence[j] - sequence[i] < 0) {
					removecounting++;
					break;	
				}else if (sequence[j] - sequence[i] == 0){
					i++;
					removecounting++;
					continue;
				}
				continue;
			}
			i++;
			j++;
			if(removecounting > 1) {
				break;
			}	
		}
		if(removecounting == 1) {
			check = true;
		}
		
		return check;
	}	
}

public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		
		int test[] = {1, 3, 2};

		AlmostAnswer al = new AlmostAnswer();

		System.out.println(al.almost(test));

	}

}
