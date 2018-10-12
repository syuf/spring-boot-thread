package com.syuf.pattern.create.abstractfactory;

public class MobileFactory extends AbstractFactory{

	@Override
	public Mobile producteMobile(String mobileType) {
		if("ios".equals(mobileType)) {
			return new IosMobile();
		} else if("android".equals(mobileType)) {
			return new AndroidMobile();
		}
		return null;
	}

	@Override
	Pc productePc(String pcType) {
		return null;
	}
}
