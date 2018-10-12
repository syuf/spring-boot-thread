/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.other.defaul;

import com.syuf.other.protectd.Person;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月28日 下午3:49:45  
 */
public class Student extends Person{

	public static void main(String[] args) {
		Student s = new Student();
		s.run();
		Person p = new Person();
		Person.docter d = p.new docter();
	}
}
