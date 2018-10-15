/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.pattern.structure.adapter.object;

/** 
 * @Description: 对象适配
 * @author: syuf
 * @date: 2018年10月15日 上午11:20:54  
 */
public class Adapter5 implements V5 {
	
	public V220 v220 = null;
	public Adapter5(V220 v220) {
		this.v220 = v220;
	}

	@Override
	public int outPut5() {
		return v220.outPut220() / 44;
	}

}
