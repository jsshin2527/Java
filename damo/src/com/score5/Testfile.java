package com.score5;

public class Testfile {

	public static void main(String[] args) {
	
		String path = System.getProperty("user.dir");
		String os = System.getProperty("os.name");
		String name = System.getProperty("user.name");
		String osver = System.getProperty("os.version");
		String osarch = System.getProperty("os.arch");
		String javaver = System.getProperty("java.version");
		String javavendor = System.getProperty("java.vendor");
		String pathseparator = System.getProperty("path.separator");
		String userhome = System.getProperty("user.home");
		
		
		System.out.println(path);
		System.out.println(os);
		System.out.println(name);
		System.out.println(osver);
		System.out.println(osarch);
		System.out.println(javaver);
		System.out.println(javavendor);
		System.out.println(pathseparator);
		System.out.println(userhome);
		
	}
}
