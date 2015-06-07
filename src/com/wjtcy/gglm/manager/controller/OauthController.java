package com.wjtcy.gglm.manager.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.opensymphony.oscache.util.StringUtil;
import com.wjtcy.gglm.manager.server.CommonService;
import com.wjtcy.third.weixin.constants.WeixinConstants;
import com.wjtcy.utils.HttpUtils;

/**
 * 获取微信服务器的token
 * 
 * @date 2015年6月6日 下午1:48:52
 *
 */
@Controller
public class OauthController {

	/**
	 * 获取token的服务信息
	 */
	@Autowired
	private CommonService commonService;

	/**
	 * 授权跳转地址信息
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "oauth", method = RequestMethod.GET)
	public String oauth(HttpServletRequest request,
			HttpServletResponse response) {
		String code = request.getParameter("code");
		if(StringUtil.isEmpty(code)){
			//没有授权，跳转到错误页面
			return "";
		}else{
			//跳转到处理接口其他接口
			// 获取token
			HttpUtils httpUtils = new HttpUtils();
			httpUtils.executeGetMethod(WeixinConstants.getAccessTokenUrl+code, null);
			if(httpUtils.getiGetResultCode()==200){
				JSONObject reqJson = JSONObject.parseObject(httpUtils
						.getStrGetResponseBody());
				//正确的token，这个需要通过refresh token 进行刷新操作
				String accessToken = reqJson.getString("access_token");
				String refreshToken = reqJson.getString("refresh_token");
				String unionid = reqJson.getString("unionid");
				String scope = reqJson.getString("scope");
				String openid = reqJson.getString("openid");
				//跳转页面中转post 到getInfo 接口信息
			}
	        return "";
		}
	}
	
	/**
	 * 获取用户的信息
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "getInfo", method = RequestMethod.GET)
	public void getUserInfo(HttpServletRequest request,
			HttpServletResponse response) {
		String accessToken = request.getParameter("token");
		String openid = request.getParameter("token");
		if(isLegal(accessToken,openid)){
		    String url = "https://api.weixin.qq.com/sns/userinfo?access_token="+accessToken+"&openid="+openid+"&lang=zh_CN";
			HttpUtils httpUtils = new HttpUtils();
			httpUtils.executeGetMethod(url, null);
			if(httpUtils.getiGetResultCode()==200){
				JSONObject reqJson = JSONObject.parseObject(httpUtils
						.getStrGetResponseBody());
				// 获取到用户的信息,微信返回json格式的用户信息
				
			}
		}
		// 不合法
		return;
	}
	
	
	
	

	/**
	 * 用户授权接口，跳转
	 * 
	 */
	@RequestMapping(value = "authorize", method = RequestMethod.GET)
	public void oauth2(HttpServletRequest request, HttpServletResponse response) {
		String state = request.getParameter("state");
		String scope = request.getParameter("scope") == null ? "snsapi_base"
				: request.getParameter("scope");
		Map<String,String> reqMap = new HashMap<String,String>();
		reqMap.put("redirect_uri", "");
		reqMap.put("response_type", "code");
		reqMap.put("scope", scope);
		reqMap.put("state", state);
		String url =getAuthorizeUrl(reqMap);
		try {
			response.sendRedirect(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}
	
	private String getAuthorizeUrl(Map<String,String> reqMap){
		StringBuffer sb = new StringBuffer();
		sb.append(WeixinConstants.authorizeUrl);
		for (Map.Entry<String, String> m : reqMap.entrySet()) {
			sb.append("&"+m.getKey()+"="+m.getValue());
		}
		sb.append("#wechat_redirect");
		return sb.toString();
		
	}
	
	

	/**
	 * accesstoken 检查
	 * 
	 * @param accessToken
	 * @param openid
	 * @return
	 */
	private boolean isLegal(String accessToken, String openid) {
		if (StringUtils.isEmpty(accessToken) || StringUtils.isEmpty(openid)) {
			return false;
		}
		String url = "https://api.weixin.qq.com/sns/auth?access_token="
				+ accessToken + "&openid=" + openid;
		HttpUtils httpUtils = new HttpUtils();
		httpUtils.executeGetMethod(url, null);
		if (httpUtils.getiGetResultCode() == 200) {
			JSONObject reqJson = JSONObject.parseObject(httpUtils
					.getStrGetResponseBody());
			String errorCode = reqJson.getString("errcode");
			if (errorCode.equalsIgnoreCase("0")) {
				return true;
			}
		}
		return false;
	}

}
