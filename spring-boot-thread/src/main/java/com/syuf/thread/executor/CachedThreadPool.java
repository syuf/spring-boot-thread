package com.syuf.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.syuf.thread.LiftOff;

public class CachedThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++) {
			exec.execute(new LiftOff());
		}
		System.out.println("如何获取线程池的当前线程名称？");
		exec.shutdown();
	}
}
