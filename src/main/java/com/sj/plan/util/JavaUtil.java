package com.sj.plan.util;

import java.util.Random;

public class JavaUtil {

	
	/**
	 * 2022.01.04 김재호
	 * 카카오톡 공유하기 기능시 랜덤URL 생성에 사용할지 고민중
	 */
	public static String RandomStr5() {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk" + "lmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(5);
		for (int i = 0; i < 5; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}

}