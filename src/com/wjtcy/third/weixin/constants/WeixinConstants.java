package com.wjtcy.third.weixin.constants;

public class WeixinConstants {

	private final static String appid = "wx56f269821189684c" ;
	
	private final static String secret = "c25ca200bd0e549e1316af870b124a18" ;
	
	/**https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET*/
	public final static String tokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+secret ;

	private final static String redirectUri = "" ;
	
	public final static String getCodeUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid="+appid+"&redirect_uri="+redirectUri+"&response_type=code&scope=snsapi_base#wechat_redirect" ;
}
