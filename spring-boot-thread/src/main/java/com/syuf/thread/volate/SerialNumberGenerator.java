/**   
 * Copyright © 2018 zlpay.
 */
package com.syuf.thread.volate;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年9月29日 下午3:07:03  
 */
public class SerialNumberGenerator {

	private static volatile int serialNumber = 0;
	
	public static synchronized int nextSerialNumber() {
		return serialNumber++;
	}
}
