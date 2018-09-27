/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.other;

public class Tank {

	private int level;
	
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 1;
		t2.level = 19;
		System.out.println("t1.level=" + t1.level + ",t2.level="  + t2.level);
		t1 = t2;
		System.out.println("t1.level=" + t1.level + ",t2.level="  + t2.level);
		t1.level = 35;
		System.out.println("t1.level=" + t1.level + ",t2.level="  + t2.level);
	}

}
