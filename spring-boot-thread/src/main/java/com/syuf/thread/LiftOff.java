package com.syuf.thread;

public class LiftOff implements Runnable {

	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	public LiftOff() {}
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	
	public String status() {
		return "线程名称=" + Thread.currentThread().getName() + 
				",线程ID=" + id + 
				",循环次数=" + (countDown > 0 ? countDown : "LiftOff!");
	}
	@Override
	public void run() {
		while(countDown-- > 0) {
			System.out.println(status());
			Thread.yield();
		}
	}
}
