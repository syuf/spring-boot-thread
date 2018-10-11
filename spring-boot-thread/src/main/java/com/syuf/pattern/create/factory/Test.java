package com.syuf.pattern.create.factory;

public class Test {

	public static void main(String[] args) {
		MobileFactory factory = new MobileFactory();

		Mobile iosMobile = factory.producteMobile("ios");
		iosMobile.say();
		Mobile androidMobile = factory.producteMobile("android");
		androidMobile.say();
	}

}
