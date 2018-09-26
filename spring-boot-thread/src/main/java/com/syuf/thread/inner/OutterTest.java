package com.syuf.thread.inner;

import com.syuf.thread.inner.OutterClass.PublicStaticInnerClass;
import com.syuf.thread.inner.OutterClass.publicInnerClass;

public class OutterTest {
	
	static class inner1{
		//变成了普通静态方法
		public static void main(String[] args) {
			System.out.println("inner main");
			OutterClass outterClass = new OutterClass();
			publicInnerClass puic = outterClass.new publicInnerClass();
			System.out.println(puic);
			OutterClass.PublicStaticInnerClass pusic= new OutterClass.PublicStaticInnerClass();
			System.out.println(pusic);
		}
	}

	public static void main(String[] args) {
		System.out.println("main");
		OutterClass outterClass = new OutterClass();
		publicInnerClass puic = outterClass.new publicInnerClass();
		System.out.println(puic);
		PublicStaticInnerClass pusic= new PublicStaticInnerClass();
		System.out.println(pusic);
		OutterTest test = new OutterTest();
		inner1.main(new String[] {"11"});
		System.out.println(test);
	}
}
