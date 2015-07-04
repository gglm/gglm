package com.wjtcy.gglm.manager.pay.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.wjtcy.gglm.manager.pay.bean.OrderRequest;
import com.wjtcy.gglm.manager.pay.bean.PayNotify;
import com.wjtcy.utils.Md5Util;


public class PayUtils {
	
	private static final Logger logger = Logger.getLogger(PayUtils.class);

	
	/**
	 * 请求xml 信息
	 * 
	 * @param request
	 * @return
	 */
	public static String generatePayRequstXML(OrderRequest request) {
		try {
			Map<String, Object> map = MapUtil.toMap(request);
			String sign = generateSign(map);
			request.setSign(sign);
			XmlMapper xmlMapper = new XmlMapper();
			String xmlContent = xmlMapper.writeValueAsString(request);
			return xmlContent;
		} catch (Exception e) {
			logger.info("生成请求xml 信息出错，e:" + e);
		}
		return null;
	}
	
	/**
	 * 解析通知信息
	 * 
	 * @param xml
	 * @return
	 */
	public static PayNotify payCallbackNotify(String xml) {
		try {
			XmlMapper xmlMapper = new XmlMapper();
			PayNotify payCallbackNotify = xmlMapper.readValue(xml,
					PayNotify.class);
			return payCallbackNotify;
		} catch (Exception e) {
			logger.info("解析回调xml 信息出错，e:" + e);
		}
		return null;
	}
	
	public static boolean validateNotify(PayNotify notify,
			Map<String, Object> map) {
		String sign = generateSign(map);
		return notify.getSign().equalsIgnoreCase(sign);
	}
	
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

	
	public static String generateSign(Map<String, Object> map){
    	Map<String, Object> orderMap = MapUtil.order(map);
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
