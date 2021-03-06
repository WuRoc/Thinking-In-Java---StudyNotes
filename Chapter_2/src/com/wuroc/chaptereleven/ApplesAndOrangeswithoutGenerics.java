//ApplesAndOrangeswithoutGenerics.java
package com.wuroc.chaptereleven;

import java.util.ArrayList;

/**
 * @author RocWu
 *
 */
class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() {
		return id;
	}
}
class Orange {
	
}

public class ApplesAndOrangeswithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i = 0; i < 3; i++) 
			apples.add(new Apple());
		//// No problem adding an Orange to apples:
			apples.add(new Orange());
			for(Object apple : apples) {
				((Apple) apple).id();
				// Orange is detected only at run time 
			}  
	}
}
