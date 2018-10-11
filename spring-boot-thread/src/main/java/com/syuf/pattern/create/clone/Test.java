package com.syuf.pattern.create.clone;

public class Test {

	public static void main(String[] args) {
		Person p = new Person("lilei", 22);
		Person p1 = (Person) p.clone();
		System.out.println(p);
		System.out.println(p1);
	}

}
