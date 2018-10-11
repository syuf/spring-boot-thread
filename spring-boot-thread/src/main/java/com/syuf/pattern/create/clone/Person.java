package com.syuf.pattern.create.clone;

public class Person implements Cloneable{

	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Object clone() {
		Person p = null;
		try {
			p = (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
