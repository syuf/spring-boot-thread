package com.syuf.pattern.create.buid;

public class PersonFactory {

	public Person buildSuperPerson(BuildPerson buildPerson) {
		buildPerson.buidAge();
		buildPerson.buildName();
		return buildPerson.buildPerson();
	}
}
