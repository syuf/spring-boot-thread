/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.thread.sync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月29日 下午4:20:26  
 */
public abstract class PairManager {
	AtomicInteger checkCounter = new AtomicInteger(0);
	protected Pair p = new Pair();
	private List<Pair> storage = Collections.synchronizedList(new ArrayList<Pair>());
	
	public synchronized Pair getPair() {
		return new Pair(p.getX(), p.getY());
	}
	
	protected void store(Pair p) {
		storage.add(p);
		try {
			TimeUnit.MILLISECONDS.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public abstract void increment();
}
