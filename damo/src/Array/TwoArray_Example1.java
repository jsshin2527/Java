package Array;

public class TwoArray_Example1 {
	
	public static void main(String[] args) {	
		
		//배열의 배열 2차원배열
		int[][] arr = new int[6][6];
		
		int i,j,n;
		
		n=0;

		for(i=0;i<5;i++) {

			for(j=0;j<5;j++) {
				n++;				
					arr[i][j] += n;
					arr[i][5] += n;
					arr[5][j] += n;
					arr[5][5] += n;
			}
		}

		for(i=0;i<arr.length;i++) {

			for(j=0;j<arr[i].length;j++) {//정사각형이 아닐때는 i갑을 준다

				System.out.printf("%4d",arr[i][j]);


			}
			System.out.println();
		}

	}

}
