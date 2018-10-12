/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.thread.sync;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月29日 下午4:31:05  
 */
public class PairManager1 extends PairManager{

	@Override
	public synchronized void increment() {
	    p.incrementX();
	    p.incrementY();
	    store(getPair());
	  }
}
