package com.wjtcy.gglm.manager.form;

public class RegResForm {

	/**城市id*/
	private String cityId ;
	
	/**商圈id*/
	private String areaId = "0" ;
	
	/**饭店名称*/
	private String resName ;
	
	/**饭店电话号码*/
	private String resPhone ;
	
	/**饭店老板*/
	private String resOwner ;
	
	/**饭店地址*/
	private String resAddr ;

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getResPhone() {
		return resPhone;
	}

	public void setResPhone(String resPhone) {
		this.resPhone = resPhone;
	}

	public String getResOwner() {
		return resOwner;
	}

	public void setResOwner(String resOwner) {
		this.resOwner = resOwner;
	}

	public String getResAddr() {
		return resAddr;
	}

	public void setResAddr(String resAddr) {
		this.resAddr = resAddr;
	}
	
}
