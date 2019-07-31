package Array;

public class SelectionSort {
	
	public static void main(String[] args) {	
		
		int[] num = {87,6,77,24,45};
		int i,j,temp;
		
		System.out.print("Source Data:");
		for(int su : num) {
			System.out.printf("%4d", su);
						
		}
		System.out.println();
		
		for(i=1;i<num.length;i++) {
			
			for(j=1;j<num.length;j++) {
				
				if(num[j]>num[j+1]) {
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
				
			}
		
		}
		System.out.print("Sorted Data:");
			for(int su : num) {
				System.out.printf("%4d", su);
			}
				System.out.println();
		}
}