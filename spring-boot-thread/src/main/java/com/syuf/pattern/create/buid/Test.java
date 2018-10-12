package com.syuf.pattern.create.buid;

public class Test {

	public static void main(String[] args) {
		PersonFactory factory = new PersonFactory();
		Person p = factory.buildSuperPerson(new SuperPerson());

		System.out.println(p.getAge());
		System.out.println(p.getName());
	}

}
