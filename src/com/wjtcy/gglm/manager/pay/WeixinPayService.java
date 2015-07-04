package com.wjtcy.gglm.manager.pay;

import com.wjtcy.gglm.manager.pay.bean.OrderRequest;
import com.wjtcy.gglm.manager.pay.bean.WeixinPayResult;

/**
 * 
 * 微信支付接口
 * 
 * @author zhangsl
 *
 */
public interface WeixinPayService {

	/**
	 * h5 下单请求
	 */
	WeixinPayResult  createOrder(OrderRequest  request);
	
	
	/**
	 * 支付请求信息
	 */
	WeixinPayResult  payOrder();
	
	/**
	 * h5  支付返回结果请求信息
	 */
	WeixinPayResult  payNotify(String xml);
}
