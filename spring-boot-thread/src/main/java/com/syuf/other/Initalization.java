/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.other;

public class Initalization {

	int i = i();//通过方法初始化
	int i() {
		return 0;
	}
	int a;//非静态块初始化
	{
		a = 1;
	}
	final int b;//被final修饰的变量,非静态代码块初始化
	{
		b = 2;
	}
	final int c = c();//被final修饰的变量通过方法初始化
	int c() {
		return 1;
	}
	final int cc;
	
	static int dd = d();
	static int d() {
		return 1;
	}
	final static int e;
	final static int f = f();
	static int f() {
		return 6;
	}
	
	//静态代码块
	static int d;
	static {
		d = 4;
		e = 5;
	}
	
	
	static int si;
	Initalization (int n){
		this.cc = n;
		si = 11;
	}
	public static void main(String[] args) {
		System.out.println(Initalization.si);
	}
}
