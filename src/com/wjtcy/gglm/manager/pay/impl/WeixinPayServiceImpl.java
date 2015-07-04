package com.wjtcy.gglm.manager.pay.impl;

import java.util.Map;

import com.wjtcy.gglm.manager.pay.WeixinPayService;
import com.wjtcy.gglm.manager.pay.bean.OrderRequest;
import com.wjtcy.gglm.manager.pay.bean.OrderResponse;
import com.wjtcy.gglm.manager.pay.bean.PayNotify;
import com.wjtcy.gglm.manager.pay.bean.WeixinPayResult;
import com.wjtcy.gglm.manager.pay.util.Configure;
import com.wjtcy.gglm.manager.pay.util.MapUtil;
import com.wjtcy.gglm.manager.pay.util.PayUtils;
import com.wjtcy.gglm.manager.pay.util.WeixinResultBuilder;
import com.wjtcy.utils.HttpUtils;

public class WeixinPayServiceImpl implements WeixinPayService {

	@Override
	public WeixinPayResult createOrder(OrderRequest request) {
		if (request == null) {
			return WeixinResultBuilder
					.buildFailResult(WeixinResultBuilder.PARAM_ERROR);
		}
		// 处理支付参数请求信息
		String requestXml = PayUtils.generatePayRequstXML(request);
		HttpUtils httpUtils = new HttpUtils();
		httpUtils.executePostMethod(Configure.UNIFY_PAY_API, requestXml,
				WeixinResultBuilder.MT_XML);
		if (httpUtils.getiGetResultCode() == 200) {
			Map<String, Object> reqMap = MapUtil.xmlToMap(httpUtils
					.getStrGetResponseBody());
			String resultCode = String.valueOf(reqMap.get("return_code"));
			if (resultCode.equalsIgnoreCase("SUCCESS")) {
				OrderResponse response = new OrderResponse();
				return WeixinResultBuilder.buildSuccessResult(response);
			} else {
				String returnMsg = String.valueOf(reqMap.get("return_msg"));
				return WeixinResultBuilder.buildFailResult(returnMsg);
			}
		}
		return WeixinResultBuilder
				.buildFailResult(WeixinResultBuilder.HTTP_ERROR);
	}

	@Override
	public WeixinPayResult payOrder() {
		return null;
	}

	@Override
	public WeixinPayResult payNotify(String xml) {
		PayNotify notify = PayUtils.payCallbackNotify(xml);
		String notifyStr = PayUtils.generatePaySuccessReplyXML();
		if (notify.getReturn_code().equalsIgnoreCase("SUCCESS")) {

			Map<String, Object> map = MapUtil.xmlToMap(xml);
			// 需要验证签名信息
			boolean isSuccess = PayUtils.validateNotify(notify, map);
			if (!isSuccess) {
				notifyStr = PayUtils.generatePayFailReplyXML();
			} else {
				notifyStr = notifyOrder(notify);
			}

		}
		return WeixinResultBuilder.buildSuccessResult(notifyStr);

	}

	/**
	 * 处理订单信息
	 * 
	 * @param notify
	 * @return
	 */
	private String notifyOrder(PayNotify notify) {
		// TODO
		if (notify.getResult_code().equalsIgnoreCase("SUCCESS")) {

		} else {

		}
		return PayUtils.generatePaySuccessReplyXML();
	}

}
