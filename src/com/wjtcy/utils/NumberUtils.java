package com.wjtcy.utils;

public class NumberUtils {

	public static int parseInt( String s,int def ){
		try{
			return Integer.parseInt(s) ;
		}catch(Exception e ){
			return def ;
		}
	}
}
