/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.other;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月27日 下午5:49:00  
 */
public class Cupboard {

	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	
	Cupboard(){
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	void f3(int maker) {
		System.out.println("f3(" + maker + ")");
	}
	static Bowl bowl5 = new Bowl(5);
}
