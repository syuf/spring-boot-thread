/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.pattern.behavior.strategy;

/** 
 * @Description: 计算价格策略接口
 * @author: syuf
 * @date: 2018年10月15日 上午10:45:24  
 */
public interface CalculatePrice {

	double discount(double amt);
}
