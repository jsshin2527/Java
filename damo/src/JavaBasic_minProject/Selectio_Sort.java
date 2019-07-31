package JavaBasic_minProject;

public class Selectio_Sort {
	
	public static void main(String[] args) {
		//정렬
		//오름차순(1,2,3,4)
		//내림차순(4,3,2,1)	
		//Selection Sort가장 많이 쓰는 정렬방식
		int[] num = {28,30,56,12,5};
		int i,j,temp;
		System.out.print("Source Data: ");
		for(i=0;i<num.length;i++) {//=을 넣으면ArrayIndexOutOfBoundsException 배열의 인덱스가 범위를 벗어남
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		//Selection sort
		for(i=0;i<num.length-1;i++) {//하나빼주고
			for(j=i+1;j<num.length;j++) {//하나더해주고
		//System.out.println(i + "+" + j);
			if(num[i]>num[j]) {//<내림차순		
				temp=num[i];
				num[i] = num[j];
				num[j] = temp;									
				}
			}
		}
		//정렬작업 Selection Sort
		//정렬한걸 출력
		System.out.print("Sorted Data: ");
		for(int n : num) {//확장for문. 배열에서 쓸수있음
			              //일정공간에 연속적으로 되어있는 값을 읽어올때 쓴다
			System.out.printf("%4d",n);
		}
	}
}
