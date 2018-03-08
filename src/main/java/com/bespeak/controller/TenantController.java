package com.bespeak.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bespeak.common.ResponseUtil;
import com.bespeak.common.ResultBean;
import com.bespeak.entity.Tenant;
import com.bespeak.service.TenantService;

import net.sf.json.JSONObject;

/**
 * 用户controller层
 * @author cedo
 *
 */
@Controller
@RequestMapping("/user")
public class TenantController {
	
	@Autowired
	private TenantService tenantSerivce;
	
	/**
	 * 管理员登录
	 * @param user
	 * @param request
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/admin/login",method=RequestMethod.POST)
	@ResponseBody
	public String login(Tenant tenant, HttpServletRequest request,HttpServletResponse response) throws IOException {
		Tenant currentTenant = tenantSerivce.login(tenant);
		if(currentTenant != null) {
			request.getSession().setAttribute("currentTenant", currentTenant);
			return "forward:/WEB-INF/success.jsp";
		}else {
			ResultBean result = new ResultBean();
			result.setResult(false);
			result.setMessage("用户名或密码错误！");

			//转为JSON数据
			JSONObject object = JSONObject.fromObject(result);
			ResponseUtil.write(response, object);
			return null;
		}
	}
	
	@RequestMapping(value="/admin/login",method=RequestMethod.GET)
	public String login(HttpServletRequest request) {
		Tenant currentTenant = (Tenant) request.getSession().getAttribute("currentTenant");
		if(currentTenant != null) {
			//写回JSON
			
			JSONObject result = new JSONObject();
			result.put("userName", currentTenant.getUserName());
			result.put("auth", currentTenant.getTenantId());
			
			JSONObject json = JSONObject.fromObject(result);
			return json.toString();
		}
		return null;
	}

	
}
