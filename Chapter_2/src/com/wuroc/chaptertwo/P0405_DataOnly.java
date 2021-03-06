//: P0405_DataOnly.java

package com.wuroc.chaptertwo;

/**
 * @author HepengWu
 * @author www.github.com/WuRoc
 * @version 1.0
 * @2020年6月3日
 *
 * 
 */
public class P0405_DataOnly {
private static final String B = null;
//	java语言中当在全局变量时，可以不给初值。
//	但在局部变量会报错
	int i;
	float f;
	double d;
	boolean b;
	long l;
	char c;
	short s;
	//这里必须定义为static
    static byte bt;
	
	public static void main(String[] arg) {

		P0405_DataOnly p = new P0405_DataOnly();
//		objectReference.member
		p.i = 47;
//		float 需要加f  或者  向上转型  p.f = (float) 0.0;
//      
		
		p.f = 0.0f;
		p.d = 1;
		p.b =false;
		p.l = 9L;
		p.c ='\u0000';
		p.s = 5;
		p.bt= 1;
		
		System.out.println("p.i="+p.i);
		System.out.println("p.f="+p.f);
		System.out.println("p.d="+p.d);
		System.out.println("p.b="+p.b);
		System.out.println("p.l="+p.l);
		System.out.println("p.c="+p.c);
		System.out.println("p.s="+p.s);
		System.out.println("p.bt="+bt);
		
	}

} /* Output
p.i=47
p.f=0.0
p.d=1.0
p.b=false
p.l=9
p.c='空格' 
p.s=5
p.bt=1
*///:~
