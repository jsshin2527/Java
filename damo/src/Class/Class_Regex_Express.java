package Class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ���� ǥ���� 
 * java.util.regex
 * �ܾ�ٲٱ�,�����ּҰ˻�,���Ͽ��� ����ڱ��� 
 * 
 * c[a-z]*: c�� �����ϴ� ���ܾ� (c,ca,caa) ���� 
 * *�� �ƹ����̳� ���͵� �������ϴ�. 
 * c[a-z] : c�� �����ϴ� �α����� ���ܾ�  (ca,cb)
 * c[a-zA-Z0-9] : ca,cA,c9 �α��� �ܾ� 
 * c. : c�� �����ϴ� �α���  (ca,cB,c&,c1) 
 * c.*: c�� �����ϴ� ��� ���� 
 * c.*t : ct.chhhht.c7777t ���� c�� �����ϰ� t�� ������ ��繮�� 
 * [b|c].* : �Ǵ� [bc].*  �Ǵ� [b-c].* : b,c,bbb\
 * [^b|c].* : �Ǵ� [^bc].*  �Ǵ� [^b-c].* : b��c�� �������� �ʴ� ���� 
 * .*c.*: c�� ���Ե� ��� ���� 
 * [\\d]+�Ǵ� [0-9]+ : �ϳ��̻��� ����  
 * 
 * 
 */

public class Class_Regex_Express {

	public static void main(String[] args) {
		
		String[] str = {"bat","baby","bnous","c","cA","ca","c.","c0","car","comba","date","disc"};
		
		Pattern p;
		
		p=Pattern.compile("c.");
		
		for (String s: str) {
			Matcher m = p.matcher(s);
			if(m.matches()) {
				System.out.println(s);
			}
		}
		System.out.println("====================================");
		
		String[] mails = {"aaa@aaa.com","@aaa.co.kr",".@bbb.com","aaa@vvv.co.kr","sss.co.kr","abc@aaa"};	
		/*
 
		 [\\w]+ : �ѱ��� �̻��� ��,����
		 @
		 (\\.[\\w]+) : ��ȣ�ȿ��ִ°��� �ݵ�� �ѹ��� �;� �մϴ�, 
		 \\. : �� �ݵ�� �;��մϴ�. 
		
		 */
		//�̸������� üũ 
		String pat = "[\\w]+@[\\w]+(\\.[\\w+]+)+";
		
		for (String s : mails) {		
			
			if(Pattern.matches(pat,s)) {
				System.out.println(s);
			}
			
		}
		//			 
	}
	
}

