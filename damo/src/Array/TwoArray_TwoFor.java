package Array;

public class TwoArray_TwoFor {
	
	public static void main(String[] args) {	
		
		int[][] a = {{3,5,6},{4,7,9},{2,3,4}};
		int[][] b = {{2,6,5},{7,8,1},{6,7,2}};
		
		int[][] sum = new int[3][3];
		
		int i,j,n;
		
		
		//이중포문
		
		for(i=0;i<a.length;i++) {	
			for(j=0;j<a.length;j++) {		
				sum[i][j] = a[i][j] + b[i][j];			
				System.out.printf("%4d",sum[i][j]);
			}		
			System.out.println();
		}		
		System.out.println(a.length);	
	}

}
