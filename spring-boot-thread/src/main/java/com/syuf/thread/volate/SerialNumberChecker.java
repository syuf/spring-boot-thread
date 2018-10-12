/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.thread.volate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月29日 下午3:00:12  
 */
public class SerialNumberChecker {

	private static final int SIZE = 10;
	private static CircularSet Serials = new CircularSet(1000);
	private static ExecutorService exec = Executors.newCachedThreadPool();
	
	static class SerialChecker implements Runnable{

		@Override
		public void run() {
			while(true) {
				int serial = SerialNumberGenerator.nextSerialNumber();
				if(Serials.contains(serial)) {
					System.out.println("duplicate: " + serial);
					System.exit(0);
				}
				Serials.add(serial);
			}
		}
		
		public static void main(String[] args) throws NumberFormatException, InterruptedException {
			for(int i = 0; i< SIZE; i++) {
				exec.execute(new SerialChecker());
			}
			if(args.length > 0) {
				TimeUnit.SECONDS.sleep(new Integer(args[0]));
				System.out.println("no duplicate detected!!");
				System.exit(0);
			}
		}
	}
}
