/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.thread.sync;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月29日 下午4:34:50  
 */
public class PairManipulator implements Runnable {

	private PairManager pm;
	
	public PairManipulator(PairManager pm) {
		this.pm = pm;
	}
	@Override
	public void run() {
		while(true) {
			pm.increment();
		}
	}
	public String toString() {
		return "Pair: " + pm.getPair() + " checkCounter = " + pm.checkCounter.get();
	}
}
