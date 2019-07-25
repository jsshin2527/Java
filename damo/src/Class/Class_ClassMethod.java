package Class;
/*
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Class_ClassMethod {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("클래스명 [java.lang.String] : ");
		String str = br.readLine();
		/*
		 * DB를 할때 클래스 정보를 불러와야할 경우가 있습니다.
		 * 그렇때 다음 코드를 정의해 줍니다. 
		 * 
		 */
		Class<?> cls = Class.forName(str);
		
		//생성자 
		Constructor<?>[] c = cls.getConstructors();
		System.out.println("생성자 ....");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		//필드
		Field[] f = cls.getFields();
		System.out.println("필드....");
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		//메소드
		Method[] m = cls.getMethods();
		System.out.println("메소드...");
		for (int i = 0; i <m.length; i++) {
			System.out.println(m[i]);
		}
	}
}
