package com.bespeak.dao;

import java.util.Map;

import com.bespeak.entity.Tenant;

public interface TenantDao {

	/**
	 * 租户登录
	 * @param tenant
	 * @return
	 */
	public Tenant login(Tenant tenant);
	
	/**
	 * 查询租户
	 * @param map 查询条件
	 * @return
	 */
	public Tenant find(Map<String, Object> map);
	
	
	public int insertTenant(Tenant tenant);
}
