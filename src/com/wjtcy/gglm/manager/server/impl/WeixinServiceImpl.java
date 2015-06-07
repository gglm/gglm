package com.wjtcy.gglm.manager.server.impl;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.wjtcy.gglm.manager.server.CommonService;
import com.wjtcy.third.weixin.bean.AccessTokenBean;
import com.wjtcy.third.weixin.bean.OpenidBean;
import com.wjtcy.third.weixin.constants.WeixinConstants;
import com.wjtcy.utils.HttpUtils;

public class WeixinServiceImpl implements CommonService {
	
	private AccessTokenBean accessToken = new AccessTokenBean() ; 
	

	@Override
	public AccessTokenBean weixinAdminSyn() {
		// TODO Auto-generated method stub
		if( !accessToken.isExpire() ){
			return accessToken ;
		}
		HttpUtils httpUtils = new HttpUtils() ;
		if( httpUtils.executeGetMethod(WeixinConstants.tokenUrl, null) ){
			String tokenResult = httpUtils.getStrGetResponseBody() ;
			if( null != tokenResult ){
				Map json = (Map)JSON.parse(tokenResult) ;
				System.out.println(json);
				if( json.containsKey("access_token") ){
					accessToken.setAccessToken(String.valueOf(json.get("access_token")));
					accessToken.setExpiresIn(Integer.valueOf(String.valueOf(json.get("expires_in"))));
					return accessToken ;
				}else if( json.containsKey("errcode") ){
					
				}
			}
		}
		return null ;
	}
	
	public OpenidBean getUserOpenid(final String accessToken){
		OpenidBean bean = new OpenidBean() ;
		if( StringUtils.isEmpty(accessToken) ){
			return bean;
		}
		
		return bean ;
	}

}
