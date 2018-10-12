package com.syuf.pattern.create.abstractfactory;

public class ProducerFactory {

	public static AbstractFactory buildFactory(String factoryType) {
		if("mobile".equals(factoryType)) {
			return new MobileFactory();
		} else if("pc".equals(factoryType)) {
			return new PcFactory();
		}
		return null;
	}
}
