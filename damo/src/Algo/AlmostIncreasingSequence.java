package Algo;

class AlmostAnswer{
	
	public boolean almost(int[] sequence) {
		
		boolean check = false;
		
		int i = 0;
		int j = i+1;
		
		int removecounting = 0;
		
		if(sequence.length < 2)
		
		while(j<sequence.length) {
		
			if(sequence[j]-sequence[i] <= 0) {
				removecounting++;
				j++;
				continue;
			}
			
			i++;
			j = i+1;
			
			if(removecounting > 1) {
				check = false;
				break;
			}
		}

		if(removecounting == 1) {
			check = true;
		}
		
		System.out.println(removecounting);
		return check;
	}
}

public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		
		int test[] = {3, 5, 67, 98, 3};
		
		AlmostAnswer al = new AlmostAnswer();
	
		System.out.println(al.almost(test));
		
		
		
	}

}
