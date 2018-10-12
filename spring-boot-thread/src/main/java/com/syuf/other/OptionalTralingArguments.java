/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.other;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月28日 下午2:35:24  
 */
public class OptionalTralingArguments {
	
	static void f(int n, double... cs) {
		System.out.println(n);
		System.out.println(cs.getClass());
		System.out.println(cs.length);
	}
	
	public static void main(String[] args) {
		f('a');
	}
}
