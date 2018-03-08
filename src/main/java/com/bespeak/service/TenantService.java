package com.bespeak.service;

import com.bespeak.entity.Tenant;

public interface TenantService {

	/**
	 * 管理员登录
	 * @param tenant
	 * @return
	 */
	public Tenant login(Tenant tenant);
}
