package com.gaojie.qhit01;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月18日 上午11:57:06
 */
public class Test3 {
	public static void main(String[] args) {

		System.out.println("1000以内所有的奇数为：");
		
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			
			if (i % 2 != 0) {
				System.out.print(i + "\t");
				sum += 1;
				
				if (sum % 5 == 0) {
					System.out.println();
				}
			}
		}

	}

}
