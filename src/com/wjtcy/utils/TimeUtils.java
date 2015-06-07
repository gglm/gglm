package com.wjtcy.utils;

public class TimeUtils {

	/**
	 * 返回时间 到秒
	 * @return
	 */
	public static int getCurrentTime(){
		long c = System.currentTimeMillis() ;
		int currentTime = (int) ( c / 1000 ) ;
		return currentTime ;
	}
}
