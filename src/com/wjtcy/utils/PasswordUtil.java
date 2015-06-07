package com.wjtcy.utils;

import java.util.regex.Pattern;

import com.wjtcy.constants.CommonConstants;
import com.wjtcy.gglm.manager.encrypt.Encrypt;

public class PasswordUtil {

	/**
	 * 密码加密
	 * @param password
	 * @return
	 */
	public static String encPassword( String password ){
		Encrypt enc = new Encrypt() ;
		String enPassword = Md5Util.md5(password) ;
		enPassword = enc.encode(enPassword+CommonConstants.AdAdminPasswordSalt);
		return enPassword ;
	}
	
	/**
	 * 判断密码是否相同
	 * @param password
	 * @param enPwd
	 * @return
	 */
	public static boolean isEqual( String password,String enPwd ){
		if( null == password || "".equals(password.trim()) ){
			return false ;
		}
		Encrypt enc = new Encrypt() ;
		String enPassword = Md5Util.md5(password) ;
		enPassword = enc.encode(enPassword+CommonConstants.AdAdminPasswordSalt);
		if( enPassword.equals(enPwd) ){
			return true ;
		}
		return false ;
	}
	
	 /**
	  * 密码负责度判断
	 * @param password
	 * @return
	 */
	public static int pswdStrength(String password) {
		String strongRegex = "^(?=.{8,})(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？])(?=.*\\W).*$";
		String mediumRegex = "^(?=.{7,})(((?=.*[A-Z])(?=.*[a-z]))|((?=.*[A-Z])(?=.*[0-9]))|((?=.*[a-z])(?=.*[0-9]))).*$";
		String enoughRegex = "(?=.{6,}).*";
		try {
		    
		    if (Pattern.matches(strongRegex, password)) {
		        return 3;
		    }
		    if (Pattern.matches(mediumRegex, password)) {
		        return 2;
		    }
		    if (Pattern.matches(enoughRegex, password)) {
		        return 1;
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return 0;
	}
	 
	 public static void main( String[] args ){
		 int i = pswdStrength("19880905") ;
		 System.out.println(i);
		 i = pswdStrength("19880905lyg") ;
		 System.out.println(i);
		 i = pswdStrength("19880905lyg") ;
		 System.out.println(i);
	 }
}
