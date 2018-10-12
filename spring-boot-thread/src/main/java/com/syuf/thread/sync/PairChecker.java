/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.thread.sync;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月29日 下午4:40:25  
 */
public class PairChecker implements Runnable {

	private PairManager pm;
	
	public PairChecker(PairManager pm) {
		this.pm = pm;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(pm.getClass().getName() + " : " + pm.checkCounter.get());
			pm.checkCounter.incrementAndGet();
			pm.getPair().checkState();
		}

	}

}
