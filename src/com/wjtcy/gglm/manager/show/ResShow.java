package com.wjtcy.gglm.manager.show;

import java.io.Serializable;

import com.wjtcy.gglm.manager.encrypt.Encrypt;

public class ResShow implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6817087567070292358L;

	private int id ;
	
	/**城市id*/
	private int cityId = 0 ;
	
	/**商圈id*/
	private int areaId = 0 ;
	
	/**饭店名称*/
	private String resName ;
	
	/**饭店电话*/
	private String resPhone ;
	
	/**饭店老板*/
	private String resOwner ;
	
	/**饭店地址*/
	private String resAddr ;
	
	private String idEnc ;
	
	private int status = 0 ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getIdEnc(){
		Encrypt enc;
		try {
			enc = new Encrypt();
			idEnc = enc.encrypt(id+"") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idEnc ;
	}
}
