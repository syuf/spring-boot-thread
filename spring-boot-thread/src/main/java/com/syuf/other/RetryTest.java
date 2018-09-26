package com.syuf.other;

public class RetryTest {
	
	public static void main(String[] args) {
      retry:// 1（行2）
		for (int i = 0; i < 10; i++) {
//			retry:// 2（行4）
				while (i == 5) {
					continue retry;
				}
		System.out.print(i + " ");
		}
	}

}
