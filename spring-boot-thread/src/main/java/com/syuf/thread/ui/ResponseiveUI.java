package com.syuf.thread.ui;

import java.io.IOException;

public class ResponseiveUI extends Thread{
	
	private volatile static double d = 1;
	
	public ResponseiveUI() throws IOException {
		setDaemon(true);
		start();
	}
	
	@Override
	public void run() {
		while(true) {
			d = d + (Math.PI + Math.E) / d;
		}
	}
	
	public static void main(String[] args) throws IOException {
//		new UnresponseiveUI();
		new ResponseiveUI();
		System.out.println("aaaaaaaaa");
		System.in.read();
		System.out.println(d);
	}
}
