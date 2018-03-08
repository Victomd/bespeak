package com.bespeak.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bespeak.dao.TenantDao;
import com.bespeak.entity.Tenant;
import com.bespeak.service.TenantService;

@Service("userService")
public class TenantServiceImpl implements TenantService {

	@Autowired
	private TenantDao tenantDao;
	
	public Tenant login(Tenant tenant) {
		return tenantDao.login(tenant);
	}

}
