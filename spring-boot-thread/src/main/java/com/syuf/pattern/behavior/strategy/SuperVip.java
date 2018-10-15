/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.pattern.behavior.strategy;

/** 
 * @Description: 超级会员价格计算 策略实现
 * @author: syuf
 * @date: 2018年10月15日 上午10:53:52  
 */
public class SuperVip implements CalculatePrice {

	@Override
	public double discount(double amt) {
		return amt * 0.8;
	}

}
