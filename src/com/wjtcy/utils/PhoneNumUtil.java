package com.wjtcy.utils;

import java.util.regex.Pattern;

public class PhoneNumUtil {
	private final static String cellPhoneReg = "^[1][3-8]\\d{9}$" ;
	
	/**
	 * 判断是否为手机号码
	 * @param phoneNum
	 * @return
	 */
	public static boolean checkCellPhoneNum(String phoneNum){
		if( null == phoneNum ){
			return false;
		}
		return Pattern.matches(cellPhoneReg, phoneNum);
	}
	
	
	public static void main(String[] args){
		System.out.println(checkCellPhoneNum("18710195635"));
	}

}
