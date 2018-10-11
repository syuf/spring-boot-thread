package com.syuf.pattern.create.buid;

public class SuperPerson implements BuildPerson{
	
	Person p = new Person();

	@Override
	public void buildName() {
		p.setName("超人");
		
	}

	@Override
	public void buidAge() {
		p.setAge(100);
		
	}

	@Override
	public Person buildPerson() {
		return p;
	}

}
