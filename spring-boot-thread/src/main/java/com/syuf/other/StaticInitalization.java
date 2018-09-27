/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.other;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月27日 下午5:53:16  
 */
public class StaticInitalization {

	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}
	
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
}
