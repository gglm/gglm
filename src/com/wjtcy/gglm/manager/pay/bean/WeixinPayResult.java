package com.wjtcy.gglm.manager.pay.bean;

import java.io.Serializable;

/**
 * 微信支付的返回结果参数
 * 
 * @author zhangsl
 *
 */
public class WeixinPayResult implements Serializable{
	
	private static final long serialVersionUID = 1211825903959236241L;

	private boolean isSuccess;
    
    private String message;
    
    private Object object;

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
    
    
}
