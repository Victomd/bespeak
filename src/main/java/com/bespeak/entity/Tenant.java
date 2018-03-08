package com.bespeak.entity;

/**
 * 租户管理员
 * @author cedo
 *
 */
public class Tenant {
	
	private int id;	//租户id
	
	private String userName;	//租户用户名
	
	private String password;	//租户密码
	
	private int tenantId;		//上级管理员id

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTenantId() {
		return tenantId;
	}

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}
	
}
