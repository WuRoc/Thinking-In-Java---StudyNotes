//: P05_Storage.java

package com.wuroc.chaptertwo;

/**
 * @author HepengWu
 * @author www.github.com/WuRoc
 * @version 1.0
 * @2020年6月3日
 *
 * 
 */
public class P06_Storage {
	
	static String s="asdad";
	int storage(String s) {
		return s.length()*2;
	}
//	另外的一种方法
//	void print() {
//		System.out.println("storge(s)="+storage(s));
//			
//		}
		
	
	public static void main(String[] args) {
		P06_Storage p = new P06_Storage();
		
//		p.print();
		System.out.println(p.storage(s));
		
	}
	
	

}
