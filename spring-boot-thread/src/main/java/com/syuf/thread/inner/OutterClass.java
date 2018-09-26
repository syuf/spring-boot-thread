package com.syuf.thread.inner;

public class OutterClass {

	private class PrivateInnerClass{
		
	}
	
	public class publicInnerClass{
		
	}
	
	private static class privateStaticInnerClass{
		
	}
	
	public static class PublicStaticInnerClass{
		
	}
	
	public static void main(String[] args) {
		OutterClass outterClass = new OutterClass();
		
		PrivateInnerClass pric = outterClass.new PrivateInnerClass();
		publicInnerClass puic = outterClass.new publicInnerClass();
		
		OutterClass.privateStaticInnerClass pisic = new privateStaticInnerClass();
		OutterClass.PublicStaticInnerClass pusic= new OutterClass.PublicStaticInnerClass();
		System.out.println(pric);
		System.out.println(puic);
		System.out.println(pisic);
		System.out.println(pusic);
	}
}
