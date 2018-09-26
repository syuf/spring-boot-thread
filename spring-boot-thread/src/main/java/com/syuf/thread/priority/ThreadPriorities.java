package com.syuf.thread.priority;

public class ThreadPriorities implements Runnable {
	private int countDown = 5;
	private volatile double d;
	
	public String toString () {
		return Thread.currentThread() + " : " + countDown;
	}

	@Override
	public void run() {
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
		for(int i = 1; i < 6; i++) {
			ThreadPriorities tp = new ThreadPriorities();
			Thread t = new Thread(tp);
			if(i < 5) {
				t.setPriority(Thread.MIN_PRIORITY);
			} else {
				t.setPriority(Thread.MAX_PRIORITY);
			}
			t.start();
		}
	}

}
