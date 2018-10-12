package com.syuf.pattern.create.abstractfactory;

public abstract class AbstractFactory {

	abstract Mobile producteMobile(String mobileType);
	abstract Pc productePc(String pcType);
}
