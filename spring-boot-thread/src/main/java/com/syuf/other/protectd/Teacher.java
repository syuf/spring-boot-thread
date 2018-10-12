/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.other.protectd;

import com.syuf.other.protectd.Person.Solar;
import com.syuf.other.protectd.Person.docter;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月28日 下午4:02:45  
 */
public class Teacher {

	public static void main(String[] args) {
		Person p = new Person();
		p.talk();
		p.run();
		p.weit = 111;
		Solar so = p.new Solar();
		docter d = p.new docter();
	}
}
