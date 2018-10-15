/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.pattern.structure.adapter.classes;

/** 
 * @Description: 类适配
 * @author: syuf
 * @date: 2018年10月15日 上午11:20:54  
 */
public class Adapter5 extends Power220 implements V5 {

	@Override
	public int outPut5() {
		
		return outPut220() / 44;
	}

}
