package com.wjtcy.third.weixin.bean;

import com.wjtcy.utils.TimeUtils;

public class AccessTokenBean {

	private String accessToken ;
	
	/**过期时间，单位为秒*/
	private int expiresIn ;
	
	/**请求时间*/
	private long requestTime = TimeUtils.getCurrentTime() ;

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

	public long getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(long requestTime) {
		this.requestTime = requestTime;
	}
	
	/**
	 * 是否过期，true：已过期，false：尚未过期
	 * @return
	 */
	public boolean isExpire(){
		int c = TimeUtils.getCurrentTime() ;
		if( c > ( requestTime + expiresIn ) ){
			return true ;
		}
		return false ;
	}
}
