package com.syuf.thread.inner;

public class InnerThread1 {

	private int countDown = 5;
	public InnerThread1(String name) {
		new Inner(name);
	}
	private class Inner extends Thread {
		Inner(String name){
			super(name);
			start();
		}
		
		@Override
		public void run() {
			try {
				while (true) {
					System.out.println(this);
					if(--countDown == 0) {
						return;
					}
					sleep(10);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		@Override
		public String toString() {
			return getName() + " : " + countDown;
		}
	}
}
