/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.thread.sync;

/**
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月29日 下午5:14:10
 */
public class PairManager2 extends PairManager {
	public void increment() {
		Pair temp;
		synchronized (this) {
			p.incrementX();
			p.incrementY();
			temp = getPair();
		}
		store(temp);
	}
}
