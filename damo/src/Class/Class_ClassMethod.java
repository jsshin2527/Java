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
		
		System.out.print("Ŭ������ [java.lang.String] : ");
		String str = br.readLine();
		/*
		 * DB�� �Ҷ� Ŭ���� ������ �ҷ��;��� ��찡 �ֽ��ϴ�.
		 * �׷��� ���� �ڵ带 ������ �ݴϴ�. 
		 * 
		 */
		Class<?> cls = Class.forName(str);
		
		//������ 
		Constructor<?>[] c = cls.getConstructors();
		System.out.println("������ ....");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		//�ʵ�
		Field[] f = cls.getFields();
		System.out.println("�ʵ�....");
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		//�޼ҵ�
		Method[] m = cls.getMethods();
		System.out.println("�޼ҵ�...");
		for (int i = 0; i <m.length; i++) {
			System.out.println(m[i]);
		}
	}
}
