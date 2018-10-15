/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.pattern.structure.adapter.object;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年10月15日 上午11:24:31  
 */
public class Mobile {
	
	Adapter5 power5 = new Adapter5(new Power220());

	void charge() {
		power5.outPut5();
	}
}
