package com.syuf.thread.priority;

import java.util.concurrent.ThreadFactory;

public class PriorityFactory implements ThreadFactory {
	
	private int priority;
	
	public PriorityFactory(int priority) {
		this.priority = priority;
	}

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setPriority(priority);
		return t;
	}

}
