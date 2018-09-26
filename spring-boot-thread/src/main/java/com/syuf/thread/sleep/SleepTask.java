package com.syuf.thread.sleep;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.syuf.thread.LiftOff;

public class SleepTask extends LiftOff {

	@Override
	public void run() {
		try {
			while(countDown-- > 0) {
				System.out.println("SleepTask: " + status());
				TimeUnit.SECONDS.sleep(5);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++) {
			exec.execute(new SleepTask());
		}
		exec.shutdown();
	}
}
