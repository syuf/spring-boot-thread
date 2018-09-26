package com.syuf.thread.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread implements Runnable{

	@Override
	public void run() {
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		try {
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("run exception!");
		}
	}

}
