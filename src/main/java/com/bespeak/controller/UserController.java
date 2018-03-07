package com.bespeak.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户controller层
 * @author cedo
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	/**
	 * 用户登录
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		return "redirect:/success.jsp";
	}

}
