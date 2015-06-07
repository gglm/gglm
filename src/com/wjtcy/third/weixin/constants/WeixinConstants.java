package com.wjtcy.third.weixin.constants;

public class WeixinConstants {

	private final static String appid = "wx56f269821189684c" ;
	
	private final static String secret = "c25ca200bd0e549e1316af870b124a18" ;
	
	/**https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET*/
	public final static String tokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+secret ;

	private final static String redirectUri = "" ;
	
	public final static String getCodeUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid="+appid+"&redirect_uri="+redirectUri+"&response_type=code&scope=snsapi_base#wechat_redirect" ;
	
	
	public final static String getQrcodeUrl ="https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=";
	
	public final static String getTicketURl ="https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=";
	
	public final static String authorizeUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid="+appid;
	
	public final static String getAccessTokenUrl ="https://api.weixin.qq.com/sns/oauth2/access_token?appid"+appid+"&secret="+secret+"&grant_type=authorization_code&code=";
}
