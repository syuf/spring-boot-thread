/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.thread.volate;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月29日 下午3:29:05  
 */
public class AtomicIntegerTest implements Runnable{
	private AtomicInteger i = new AtomicInteger(0);
	public int getValue() {
		return i.get();
	}
	public void evenIncrement() {
		i.addAndGet(2);
	}
	@Override
	public void run() {
		while(true) {
			evenIncrement();
		}
	}
	
	public static void main(String[] args) {
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("Aborting!!");
				System.exit(0);
			}
		},5000);
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicIntegerTest at = new AtomicIntegerTest();
		exec.execute(at);
		while(true) {
			int val = at.getValue();
			if(val % 2 != 0) {
				System.out.println(val);
				System.exit(0);
			}
		}
	}
}
