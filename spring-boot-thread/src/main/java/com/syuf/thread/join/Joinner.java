package com.syuf.thread.join;

public class Joinner extends Thread {
	private Sleeper sleeper;
	
	public Joinner(String name,Sleeper sleeper) {
		super(name);
		this.sleeper = sleeper;
		start();
	}
	
	@Override
	public void run() {
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		System.out.println(getName() + " join completed");
	}
}
