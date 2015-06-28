package com.wjtcy.gglm.manager.pay.util;

/**
 * 微信支付配置信息
 * 
 * @author zhangsl
 *
 */
public class Configure {

	// 应用的配置信息
	private static String appID = "wx56f269821189684c";
	private static String mchID = "1237057702";
	private static String key = "";

	// 证书信息，退款查询 需要证书加密
	private static String certLocalPath = "";
	private static String certPassword = "";

	// 回调通知地址信息
	private static String notifyCallbackUrl = "";

	// 机器IP
	private static String ip = "";

	// 1）被扫支付API
	public static String PAY_API = "https://api.mch.weixin.qq.com/pay/micropay";

	// 2）订单查询API
	public static String PAY_QUERY_API = "https://api.mch.weixin.qq.com/pay/orderquery";

	// 3）退款API
	public static String REFUND_API = "https://api.mch.weixin.qq.com/secapi/pay/refund";

	// 4）退款查询API
	public static String REFUND_QUERY_API = "https://api.mch.weixin.qq.com/pay/refundquery";

	// 5）撤销API
	public static String REVERSE_API = "https://api.mch.weixin.qq.com/secapi/pay/reverse";

	// 6）下载对账单API
	public static String DOWNLOAD_BILL_API = "https://api.mch.weixin.qq.com/pay/downloadbill";

	// 7) 统计上报API
	public static String REPORT_API = "https://api.mch.weixin.qq.com/payitil/report";

	// 8) 关闭订单
	public static String PAY_CLOSE_API = "https://api.mch.weixin.qq.com/pay/closeorder";

	// 8) 统一下单
	public static String UNIFY_PAY_API = "https://api.mch.weixin.qq.com/pay/unifiedorder";

	public static String getKey() {
		return key;
	}

	public static String getAppid() {
		return appID;
	}

	public static String getMchid() {
		return mchID;
	}

	public static String getCertLocalPath() {
		return certLocalPath;
	}

	public static String getCertPassword() {
		return certPassword;
	}

	public static String getIP() {
		return ip;
	}

	public static String getNotifyCallbackUrl() {
		return notifyCallbackUrl;
	}

	public static void setNotifyCallbackUrl(String notifyCallbackUrl) {
		Configure.notifyCallbackUrl = notifyCallbackUrl;
	}

}
