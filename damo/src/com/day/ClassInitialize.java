package com.day;

class ClassVariable{
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	boolean g;
}

public class ClassInitialize {

	public static void main(String[] args) {
		
		ClassVariable cv = new ClassVariable();
			
		System.out.println("byte    a "+cv.a);
		System.out.println("short   b "+cv.b);
		System.out.println("int     c "+cv.c);
		System.out.println("long    d "+cv.d);
		System.out.println("float   e "+cv.e);
		System.out.println("double  f "+cv.f);
		System.out.println("boolean g "+cv.g);
	}
}
