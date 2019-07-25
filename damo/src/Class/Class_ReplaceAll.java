package Class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_ReplaceAll {

	
	public static String replaceAll(String str, String oldsStr,String newStr) {
		
		if(str==null) {
			return null;
		}
		Pattern p = Pattern.compile(oldsStr);
		
		Matcher m = p.matcher(str);
		
		StringBuffer sb = new StringBuffer();
		
		while(m.find()) {
			m.appendReplacement(sb,newStr);
		}
		m.appendTail(sb); //남아있는 문자열을 뒤에 붙여라 
		return sb.toString();
	}
	
	public static void main(String[] args) {
			
		String str= "우리나라 대한민국 대한독립 대한의 건아 ....";		
		String s = Class_ReplaceAll.replaceAll(str,"대한","大韓");		
		System.out.println(s);
	}
}
