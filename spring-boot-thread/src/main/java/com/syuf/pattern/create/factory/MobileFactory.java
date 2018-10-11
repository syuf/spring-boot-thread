package com.syuf.pattern.create.factory;

public class MobileFactory {

	public Mobile producteMobile(String mobileType) {
		if("ios".equals(mobileType)) {
			return new IosMobile();
		} else if("android".equals(mobileType)) {
			return new AndroidMobile();
		}
		return null;
	}
}
