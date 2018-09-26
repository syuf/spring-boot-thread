package com.syuf.thread.daemon;

import java.util.concurrent.TimeUnit;

public class ADaemon implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("ADaemon starting!!");
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("This should always run?");
		}
	}

}
