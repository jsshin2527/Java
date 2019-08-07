package Algo;



public class MatrixElementsSum {

	static int matrixElementsSum1(int[][] matrix) {
	
		int sum = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			
			if(matrix.length == 0 && matrix[i].length == 0) {
				return sum;
			}
			
			for (int j = 0; j <matrix[i].length; j++) {
			
				if(matrix[i][j] == 0) {
					for (int k = i; k < matrix.length; k++) {
						matrix[k][j] = 0;
					}
				}
				sum += matrix[i][j];
			}
		}
		
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int [][] matrix = {
				 {1,1,1,0}, 
				 {0,5,0,1}, 
				 {2,1,3,10}};
		System.out.println(matrixElementsSum1(matrix));	
	}
}
