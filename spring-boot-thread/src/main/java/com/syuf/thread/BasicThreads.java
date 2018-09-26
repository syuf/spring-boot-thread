package com.syuf.thread;

public class BasicThreads {

	public static void main(String[] args) {
		Thread t = new Thread(new LiftOff());
		t.start();
		//如果先输出下面这句话，说明t.start()直接返回结果
		System.out.println("Waiting for LiftOff");
	}
}
