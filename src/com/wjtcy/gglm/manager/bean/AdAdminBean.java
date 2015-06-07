package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;

/**
 * 广告主注册用户
 * @author lyg
 *
 */
public class AdAdminBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/***/
	private int id ;
	
	/**用户名*/
	private String userName ; 
	
	/**真实姓名*/
	private String realName ; 
	
	/**用户权限列表说明*/
	private String privileges ;
	
	/**密码*/
	private String password ;
	
	/**联系电话*/
	private String mobile ;
	
	/**座机电话*/
	private String telephone ;
	
	/**广告主类型*/
	private int type = 1 ;
	
	/**是否通过审核，0未通过，1通过*/
	private int isConfirm = 0 ;
	
	/**用户是否删除，0为正常*/
	private int status = 0 ;
	
	/**密码复杂性*/
	private int pswComplexity = 0 ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPrivileges() {
		return privileges;
	}

	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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

	public int getPswComplexity() {
		return pswComplexity;
	}

	public void setPswComplexity(int pswComplexity) {
		this.pswComplexity = pswComplexity;
	}
	
}
