package com.wjtcy.third.weixin.bean;

import java.io.Serializable;

/**
 * 
 * 二维码生成的bean
 * 
 * @date 2015年6月6日 下午2:19:41
 *
 */
public class TicketReqBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String ticket;

	private int expireSeconds;

	private String url;

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public int getExpireSeconds() {
		return expireSeconds;
	}

	public void setExpireSeconds(int expireSeconds) {
		this.expireSeconds = expireSeconds;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
