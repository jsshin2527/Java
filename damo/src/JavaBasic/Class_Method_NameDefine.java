/*
	Class�� �̸���  �ݵ�� ù ���ڰ� �빮�� �̿��� �մϴ�. 
	
	Custom �ι�° �ܾ��� ù���ڴ� �빮�ڷ� �����ؾ��մϴ�. 
	
	CustomInfo = Custom+Info 
	
	method�̸��� ù���ڰ� �ҹ��� 
	
	�ι�° �ܾ��� ù���ڴ� �빮�� 
	
	customInfo -- ���� 
	
	custom_Info 
	
	float �Ǽ��� �����Ҽ� �ִ� �ڷ��� 
*/
package JavaBasic;

class Class_Method_NameDefine 
{
	public static void main(String[] args) 
	{
	  int r = 10;
	  float  area,length;
	  // double area,length; /*float �� 8byte �Դϴ�*/
  	  //���� ���� 
	  area = r*r*3.14f;  
	  //���� �ѷ� 
	  length = r*r*2f;
	  System.out.printf("������ : %d ���� :%f �Դϴ� \n",r,area);
	  System.out.println("\n");
	  System.out.printf("������ : %d �ѷ� :%f �Դϴ�. \n",r,length); 
	  }
}
