/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.other;


/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月27日 下午5:44:05  
 */
public class Table {

	static Bowl bowl1 = new Bowl(1);
	Table(){
		System.out.println("Table()");
		bowl2.f1(1);
	}
	
	void f2(int maker) {
		System.out.println("f2(" + maker + ")");
	}
	static Bowl bowl2 = new Bowl(2);
}
