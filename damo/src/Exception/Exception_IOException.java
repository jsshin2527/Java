package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� ���� �߻� 
//������ �ǵ������� �߻� 


public class Exception_IOException {
	
	public static String getOper() throws Exception {
		
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
		String oper = null;
		
		try {
			
			System.out.print("������ ? ");
			oper = br.readLine();
			
			if(!oper.equals("+") &&!oper.equals("-")&&!oper.equals("/")&&!oper.equals("*")) {
				
				//�ǵ������� ������ �߻��մϴ�. 
				throw new Exception("������ ���� ");
			}
		
		}catch(IOException e){
			System.out.println("Ʋ�� ������ !! ");
		}
		
		return oper;
		
	}
	
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
		int num1,num2,result=0;
		
		String oper;
		
		try {
		
		System.out.print("ù��°�� ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�ι�°�� ");
		num2 = Integer.parseInt(br.readLine());
		
		//������ 
		//�ڹٴ� ��ȯ���� �ȹ������� �ִ� 
		
		oper = Exception_IOException.getOper();
		
		if(oper.equals("+")) {
			result=num1+num2;
		}else if(oper.equals("-")){
			result=num1-num2;
		}else if(oper.equals("*")){
			result=num1*num2;
		}else if(oper.equals("/")){
			result=num1/num2;
		}
		
		System.out.printf("%d %s %d = %d",num1,oper,num2,result);
		}catch (Exception e){
			System.out.println(e.toString());
			System.out.println("�����ڰ��� �߸� �Ǿ����ϴ�. ");
			
		}
	}

}
