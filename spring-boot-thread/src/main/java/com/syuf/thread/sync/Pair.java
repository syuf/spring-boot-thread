/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.thread.sync;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月29日 下午4:02:07  
 */
public class Pair {

	private int x,y;
	public Pair() {
		this(0, 0);
	}
	public Pair(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void incrementX() {
		x++;
	}
	
	public void incrementY() {
		y++;
	}
	
	public String toString() {
		return "x: " + x + ",y; " + y;
	}
	
	public class PairValueNotEqualException extends RuntimeException {

		private static final long serialVersionUID = -3213646880270573589L;

		public PairValueNotEqualException() {
			super("Pair value not equal : " + Pair.this);
		}
	}
	
	public void checkState() {
		if(x != y) {
			throw new PairValueNotEqualException();
		}
	}
}
