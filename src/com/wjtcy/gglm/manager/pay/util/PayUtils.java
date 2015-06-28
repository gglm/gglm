package com.wjtcy.gglm.manager.pay.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;

import com.wjtcy.utils.Md5Util;


public class PayUtils {
	
	private static final Logger logger = Logger.getLogger(PayUtils.class);
	
	/**
	 * 获取当前时间 yyyyMMddHHmmss
	 * @return String
	 */ 
	public static String getCurrTime() {
		Date now = new Date();
		SimpleDateFormat outFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String s = outFormat.format(now);
		return s;
	}

	
	public static String generateSign(Map<String, String> map){
    	Map<String, String> orderMap = MapUtil.order(map);
    	String result = MapUtil.mapJoin(orderMap,true,false);
        result += "&key=" + Configure.getKey();
        result = Md5Util.md5(result).toUpperCase();
        return result;
    }
	
	/**
	 * 返回给微信的成功信息
	 */
	public static String generatePaySuccessReplyXML(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("<xml>")
					.append("<return_code><![CDATA[SUCCESS]]></return_code>")
					.append("<return_msg><![CDATA[OK]]></return_msg>")
					.append("</xml>");
		return stringBuffer.toString();
	}
	
	/**
	 * 返回给微信的失败信息
	 */
	public static String generatePayFailReplyXML(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("<xml>")
					.append("<return_code><![CDATA[FAIL]]></return_code>")
					.append("</xml>");
		return stringBuffer.toString();
	}
}
