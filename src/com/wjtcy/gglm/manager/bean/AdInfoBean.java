package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 设计的广告
 * @author lyg
 *
 */
public class AdInfoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/***/
	private int id ;
	
	/**广告语*/
	private String adContent ;
	
	/**广告图片链接*/
	private String adImgUrl ; 
	
	/**广告链接*/
	private String adUrl ; 
	
	/**广告有效时间起始时间*/
	private Timestamp adStartTime ; 
	
	/**广告有效时间结束时间*/
	private Timestamp adEndTime ; 
	
	/**广告语类型，1：广告语，2广告图片链接，3：广告链接*/
	private int adType ; 
	
	/**广告资金池*/
	private BigDecimal adFund = BigDecimal.ZERO ; 
	
	/**广告次数*/
	private int adCount = 1 ; 
	
	/**广告等级*/
	private int adLevel = 1 ; 
	
	/**是否通过审核*/
	private int isConfirm = 0 ; 
	
	/**是否删除，0为正常*/
	private int status = 0 ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdContent() {
		return adContent;
	}

	public void setAdContent(String adContent) {
		this.adContent = adContent;
	}

	public String getAdImgUrl() {
		return adImgUrl;
	}

	public void setAdImgUrl(String adImgUrl) {
		this.adImgUrl = adImgUrl;
	}

	public String getAdUrl() {
		return adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}

	public Timestamp getAdStartTime() {
		return adStartTime;
	}

	public void setAdStartTime(Timestamp adStartTime) {
		this.adStartTime = adStartTime;
	}

	public Timestamp getAdEndTime() {
		return adEndTime;
	}

	public void setAdEndTime(Timestamp adEndTime) {
		this.adEndTime = adEndTime;
	}

	public int getAdType() {
		return adType;
	}

	public void setAdType(int adType) {
		this.adType = adType;
	}

	public BigDecimal getAdFund() {
		return adFund;
	}

	public void setAdFund(BigDecimal adFund) {
		this.adFund = adFund;
	}

	public int getAdCount() {
		return adCount;
	}

	public void setAdCount(int adCount) {
		this.adCount = adCount;
	}

	public int getAdLevel() {
		return adLevel;
	}

	public void setAdLevel(int adLevel) {
		this.adLevel = adLevel;
	}

	public int getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(int isConfirm) {
		this.isConfirm = isConfirm;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	} 
	
}
