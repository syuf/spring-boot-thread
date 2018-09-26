package com.syuf.thread;

public class MoreBasicThreads {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			new Thread(new LiftOff()).start();
		}
		//不一定最先输出这句话，说明当前线程与新启动线程的执行顺序是cpu决定，并没有固定顺序
		System.out.println("Waiting for LiftOff");
	}

}
