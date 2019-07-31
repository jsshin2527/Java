/*
	Class의 이름은  반드시 첫 글자가 대문자 이여야 합니다. 
	
	Custom 두번째 단어의 첫글자는 대문자로 설정해야합니다. 
	
	CustomInfo = Custom+Info 
	
	method이름은 첫글자가 소문자 
	
	두번째 단어의 첫글자는 대문자 
	
	customInfo -- 권장 
	
	custom_Info 
	
	float 실수를 저장할수 있는 자료형 
*/
package JavaBasic;

class Class_Method_NameDefine 
{
	public static void main(String[] args) 
	{
	  int r = 10;
	  float  area,length;
	  // double area,length; /*float 는 8byte 입니다*/
  	  //원의 넓의 
	  area = r*r*3.14f;  
	  //원의 둘레 
	  length = r*r*2f;
	  System.out.printf("반지름 : %d 넓이 :%f 입니다 \n",r,area);
	  System.out.println("\n");
	  System.out.printf("반지름 : %d 둘레 :%f 입니다. \n",r,length); 
	  }
}
