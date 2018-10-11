/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.other;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月27日 下午4:55:23  
 */
public class Book {

	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	void checkIn() {
		checkedOut = false;
	}
	@Override
	protected void finalize() throws Throwable {
		if(checkedOut) {
			System.out.println("ERR : checked out");
		}
		super.finalize();
	}
	
	public static void main(String[] args) {
		Book b = new Book(true);
		b.checkIn();
		new Book(true);
		System.gc();
	}
}
