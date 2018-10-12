package com.syuf.pattern.create.abstractfactory;

public class PcFactory extends AbstractFactory{

	@Override
	public Mobile producteMobile(String mobileType) {
		return null;
	}

	@Override
	Pc productePc(String pcType) {
		if("windows".equals(pcType)) {
			return new WindowsPc();
		} else if("mac".equals(pcType)) {
			return new MacPc();
		}
		return null;
	}
}
