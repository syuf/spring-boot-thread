package com.syuf.thread.priority;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities implements Runnable {
	private int countDown = 5;
	private volatile double d;
//	private int priority;
	public SimplePriorities() {
		
	}
//	public SimplePriorities(int priority) {
//		this.priority = priority;
//	}
	
	public String toString () {
		return Thread.currentThread() + " : " + countDown;
	}

	@Override
	public void run() {
//		Thread.currentThread().setPriority(priority);
		while(true) {
			for(int i = 0; i < 10000000; i++) {
				d += (Math.PI + Math.E) / i;
				if(i % 1000 == 0) {
					Thread.yield();
				}
			}
			//java浮点数运算中有两个特殊的情况：NAN、INFINITY。
			System.out.println(d);
			System.out.println(this);
			if(--countDown == 0) {
				System.out.println("返回return 方法");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool(new PriorityFactory(Thread.MAX_PRIORITY));
		for(int i = 0; i < 5; i++) {
			exec.execute(new SimplePriorities());
		}
		exec = Executors.newCachedThreadPool(new PriorityFactory(Thread.MIN_PRIORITY));
		for(int i = 0; i < 5; i++) {
			exec.execute(new SimplePriorities());
		}
//		exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		exec.shutdown();
	}

}
