package com.syuf.thread.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread2 implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("run() by" + t);
		
		System.out.println("eh = " + t.getUncaughtExceptionHandler());
		throw new RuntimeException();
	}
}
