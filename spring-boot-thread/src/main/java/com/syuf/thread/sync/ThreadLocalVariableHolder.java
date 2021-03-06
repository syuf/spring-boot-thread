/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.thread.sync;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月30日 下午4:00:54
 */
class Accessor implements Runnable {
	private final int id;

	public Accessor(int idn) {
		id = idn;
	}

	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			ThreadLocalVariableHolder.increment();
			System.out.println(this);
			Thread.yield();
		}
	}

	public String toString() {
		return "#" + id + ": " + ThreadLocalVariableHolder.get();
	}
}

public class ThreadLocalVariableHolder {
	private static ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
		private Random rand = new Random(47);

		protected synchronized Integer initialValue() {
			return rand.nextInt(10000);
		}
	};

	public static void increment() {
		value.set(value.get() + 1);
	}

	public static int get() {
		return value.get();
	}

	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new Accessor(i));
		TimeUnit.MILLISECONDS.sleep(5); // Run for a while
		exec.shutdownNow(); // All Accessors will quit
	}
} /*
	 * Output: (Sample) #0: 9259 #1: 556 #2: 6694 #3: 1862 #4: 962 #0: 9260 #1: 557
	 * #2: 6695 #3: 1863 #4: 963 ...
	 */// :~
