package com.wjtcy.gglm.manager.bean;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 注册用户列表
 * @author lyg
 *
 */
public class UserBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3960467247830701970L;

	private int id ;
	
	/**用户名*/
	private String userName ;
	
	/**用户昵称*/
	private String nickname ;
	
	/**用户的真实姓名*/
	private String realName ;
	
	/**密码*/
	private String password ;
	
	/**用户来源,0来源于主站注册*/
	private int comeFrom = 0 ;
	
	/**注册时间*/
	private Timestamp regTime ;
	
	/**用户类型*/
	private int type = 0 ;
	
	/**是否有效*/
	private int status = 0 ;

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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getComeFrom() {
		return comeFrom;
	}

	public void setComeFrom(int comeFrom) {
		this.comeFrom = comeFrom;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Timestamp getRegTime() {
		return regTime;
	}

	public void setRegTime(Timestamp regTime) {
		this.regTime = regTime;
	}
	
}
