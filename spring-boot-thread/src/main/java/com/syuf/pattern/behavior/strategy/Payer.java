/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.pattern.behavior.strategy;

/** 
 * @Description: 环境
 * @author: syuf
 * @date: 2018年10月15日 上午10:55:15  
 */
public class Payer {
	
	CalculatePrice calPrice = null;

	public Payer(CalculatePrice calPrice) {
		this.calPrice = calPrice;
	}
	
	double calculatePrice(double amt) {
		return calPrice.discount(amt);
	}
}
