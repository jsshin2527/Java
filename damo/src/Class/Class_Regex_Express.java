package Class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규 표현식 
 * java.util.regex
 * 단어바꾸기,메일주소검사,파일에서 제어문자까지 
 * 
 * c[a-z]*: c로 시작하는 영단어 (c,ca,caa) 가능 
 * *는 아무것이나 나와도 괜찮습니다. 
 * c[a-z] : c로 시작하는 두글자의 영단어  (ca,cb)
 * c[a-zA-Z0-9] : ca,cA,c9 두글자 단어 
 * c. : c로 시작하는 두글자  (ca,cB,c&,c1) 
 * c.*: c로 시작하는 모든 문자 
 * c.*t : ct.chhhht.c7777t 가능 c로 시작하고 t로 끝나는 모든문자 
 * [b|c].* : 또는 [bc].*  또는 [b-c].* : b,c,bbb\
 * [^b|c].* : 또는 [^bc].*  또는 [^b-c].* : b나c로 시작하지 않는 문자 
 * .*c.*: c가 포함된 모든 문자 
 * [\\d]+또는 [0-9]+ : 하나이상의 숫자  
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
 
		 [\\w]+ : 한글자 이상의 영,숫자
		 @
		 (\\.[\\w]+) : 괄호안에있는것은 반드시 한번은 와야 합니다, 
		 \\. : 은 반드시 와야합니다. 
		
		 */
		//이메일인지 체크 
		String pat = "[\\w]+@[\\w]+(\\.[\\w+]+)+";
		
		for (String s : mails) {		
			
			if(Pattern.matches(pat,s)) {
				System.out.println(s);
			}
			
		}
		//			 
	}
	
}

