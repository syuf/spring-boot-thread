/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.thread.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月29日 下午4:44:21
 */
public class CriticalSection {

	static void testApproaches(PairManager pman1, PairManager pman2) {
		ExecutorService exec = Executors.newCachedThreadPool();
		PairManipulator pm2 = new PairManipulator(pman2);
		PairManipulator pm1 = new PairManipulator(pman1);
		PairChecker pcheck2 = new PairChecker(pman2);
		PairChecker pcheck1 = new PairChecker(pman1);
		exec.execute(pm2);
		exec.execute(pm1);
		exec.execute(pcheck2);
		exec.execute(pcheck1);
		try {
			TimeUnit.MILLISECONDS.sleep(50);
		} catch (InterruptedException e) {
			System.out.println("Sleep interrupted");
		}
		System.out.println("pm1: " + pm1 + "\npm2: " + pm2);
		System.exit(0);
	}

	public static void main(String[] args) {
		PairManager pman1 = new PairManager1();
		PairManager pman2 = new PairManager2();
		testApproaches(pman1, pman2);
	}
}
