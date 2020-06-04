//: p06_Increment.java

package com.wuroc.chaptertwo;

/**
 * @author HepengWu
 * @author www.github.com/WuRoc
 * @version 1.0
 * @2020年6月3日
 *
 * 
 */
class StaticTest{ 
	
	static int  i = 1010;
	
}
	


public class P07_Increment {
	
	static void increment() {
		 StaticTest.i++;
		
	}
	public static void main(String[] args){
		
		P07_Increment p =new P07_Increment();
			
		p.increment();
			
		P07_Increment.increment();
			
		increment();
	
	}
}///:~


/****************** Exercise 6 ******************
 * Turn the StaticFun code fragments into a
 * working program.
 ***********************************************/

