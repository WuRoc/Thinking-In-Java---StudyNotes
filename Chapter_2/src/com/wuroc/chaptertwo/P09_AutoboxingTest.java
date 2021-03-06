//: P09_AutoboxingTest.java

package com.wuroc.chaptertwo;

/**
 * @author HepengWu
 * @author www.github.com/WuRoc
 * @version 1.0
 * @2020年6月3日
 *
 * 
 */
public class P09_AutoboxingTest {
	public static void main(String[] args) {
		Byte by =1;
		byte bt =by;
		System.out.println("byte = "+bt);
		
		Short sh = 1;
		short s = sh;
		System.out.println("short = "+s);
		
		
		Integer in = 1;
		int i = in;
		System.out.println("int = "+i);
//		L是代表Long包装类型
		Long lo = 1L;
		long l = lo; 
		System.out.println("long = "+l);
		
		Float fl = 0.0f;
		float f=fl;
		System.out.println("float ="+fl);
		
		Double db= 0.001d;
		double d = db;
		System.out.println("double = "+db);
		
		Character ch = 'x';
		char c = ch;
		System.out.println("char ="+c);
		
		
		
	}

} /* Output:
byte = 1
short = 1
int = 1
long = 1
float =0.0
double = 0.001
char =x

*///:~
