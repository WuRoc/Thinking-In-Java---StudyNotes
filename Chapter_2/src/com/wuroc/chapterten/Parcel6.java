//Parcel6.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
public class Parcel6 {
	private void internalTracking(boolean b) {
		if(b) {
			//在定义Trackingslip的作用域之外，它是不可用的，除此外和普通类是一样的
			class TrackingSlip {
				private String id;
				/**
				 * 
				 */
				public TrackingSlip(String s) {
				id = s;
				}
				String getSlip() {
					return id;
				}
			}
				TrackingSlip ts = new TrackingSlip("slip");
				String s = ts.getSlip();
			// Can't use it here! Out of scope: 
			//- TrackingSlip ts = new TrackingSlip("x");
		}
		}
	public void track() {
		internalTracking(true);
	}
	public static void main(String[] args) {
		Parcel6 p =new Parcel6();
		p.track();
	}

}






