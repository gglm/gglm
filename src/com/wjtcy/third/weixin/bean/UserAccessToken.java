package com.wjtcy.third.weixin.bean;

import java.io.Serializable;

/**
 * 用户授权的accesstoken
 * 
 * @date  2015年6月6日 下午7:04:34
 *
 */
public class UserAccessToken implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String accessToken;
	private int expiresIn;
	private String unionid;
	private String scope;
	private String openid;
	private String refreshToken;
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public int getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}
	public String getUnionid() {
		return unionid;
	}
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
   
	

}
