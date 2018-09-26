package com.syuf.thread.join;

public class Joining {

	public static void main(String[] args) {
		 
		Sleeper	sleepy = new Sleeper("sleepy", 5500);
		Sleeper grumpy = new Sleeper("grumpy", 5500);
		
		new Joinner("dopey", sleepy);
		new Joinner("doc", grumpy);
		System.out.println("will interrupt");
		grumpy.interrupt();
		
	}
}
