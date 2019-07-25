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
		m.appendTail(sb); //�����ִ� ���ڿ��� �ڿ� �ٿ��� 
		return sb.toString();
	}
	
	public static void main(String[] args) {
			
		String str= "�츮���� ���ѹα� ���ѵ��� ������ �Ǿ� ....";		
		String s = Class_ReplaceAll.replaceAll(str,"����","����");		
		System.out.println(s);
	}
}
