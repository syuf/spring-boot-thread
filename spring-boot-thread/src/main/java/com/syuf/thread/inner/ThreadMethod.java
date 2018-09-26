package com.syuf.thread.inner;

public class ThreadMethod {
	private int countDown = 5;
	private String name;
	private Thread t;
	public ThreadMethod(String name) {
		this.name = name;
	}
	
	public void runTask() {
		if(t == null) {
			t = new Thread(name) {
				@Override
				public void run() {
					try {
						while(true) {
							System.out.println(this);
							if(--countDown == 0) {
								return;
							}
							sleep(10);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				@Override
				public String toString() {
					return getName() + " : " + countDown;
				}
			};
		}
		t.start();
	}
	
	public static void main(String[] args) {
		new InnerThread1("InnerThread1");
		new InnerThread2("InnerThread2");
		new ThreadMethod("ThreadMethod").runTask();;
	}
}
