package com.syuf.pattern.create.abstractfactory;

public class Test {

	public static void main(String[] args) {
		AbstractFactory mobileFactory = ProducerFactory.buildFactory("mobile");
		AbstractFactory pcFactory = ProducerFactory.buildFactory("pc");

		Mobile iosMobile = mobileFactory.producteMobile("ios");
		iosMobile.say();
		Mobile androidMobile = mobileFactory.producteMobile("android");
		androidMobile.say();
		Pc windowsPc = pcFactory.productePc("windows");
		windowsPc.draw();
		Pc macPc = pcFactory.productePc("mac");
		macPc.draw();
	}

}
