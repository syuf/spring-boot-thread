package com.syuf.thread.join;

public class Joining {

	public static void main(String[] args) {
		 
		Sleeper	sleepy = new Sleeper("sleepy", 1500);
		Sleeper grumpy = new Sleeper("grumpy", 1500);
		
		Joinner dopey = new Joinner("dopey", sleepy);
		Joinner doc = new Joinner("doc", grumpy);
		
		grumpy.interrupt();
		
	}
}
