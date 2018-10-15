/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.pattern.behavior.strategy;

/** 
 * @Description: 会员计算价格策略实现
 * @author: syuf
 * @date: 2018年10月15日 上午10:38:55  
 */
public class Vip implements CalculatePrice{

	@Override
	public double discount(double amt) {
		return amt * 0.9;
	}

}
