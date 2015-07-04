package com.wjtcy.gglm.manager.pay.util;

import com.wjtcy.gglm.manager.pay.bean.WeixinPayResult;

/**
 * 支付接口返回信息
 * 
 * @author zhangsl
 *
 */
public class WeixinResultBuilder {

	public final static String MT_XML = "application/xml";
	
	public static final String SERVER_ERROR = "服务器错误";
	
	public static final String HTTP_ERROR = "HTTP请求错误";

	public static final String PARAM_ERROR = "参数错误";

	public static final String SIGN_ERROR = "加密错误";

	public static final String SUCCESS = "成功";

	public static WeixinPayResult buildFailResult() {
		return buildFailResult(SERVER_ERROR);
	}

	public static WeixinPayResult buildFailResult(String message) {
		WeixinPayResult result = new WeixinPayResult();
		result.setSuccess(false);
		result.setMessage(message);
		return result;
	}

	public static WeixinPayResult buildSuccessResult(Object object) {
		return buildSuccessResult(object, SUCCESS);
	}

	public static WeixinPayResult buildSuccessResult(Object object,
			String message) {
		WeixinPayResult result = new WeixinPayResult();
		result.setSuccess(true);
		result.setMessage(message);
		result.setObject(object);
		return result;
	}
}
