package com.gaojie.qhit01;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月18日 下午12:57:39
 */
public class Test8 {
	public static void main(String[] args) {

		System.out.println("个位数为6且能被3整除的数如下表示");
		int sum = 0;
		for (int i = 100; i < 1000; i++) {

			if ((i % 10 == 6) && (i % 3 == 0)) {

				System.out.print(i + "\t");
				sum += 1;
				
				if (sum % 6 == 0) {
					
					System.out.println();

				}
			}
		}
	}

}
