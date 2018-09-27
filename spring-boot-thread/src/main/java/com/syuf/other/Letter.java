/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.other;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月27日 下午2:00:20  
 */
public class Letter {

	char c;
	
	static void f(Letter y) {
		y.c = 'z';
	}
	
	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("x.c : " + x.c);
		f(x);
		System.out.println("x.c : " + x.c);
	}
}
