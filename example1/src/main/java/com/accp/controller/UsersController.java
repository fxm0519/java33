package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Users;
import com.accp.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersService service;
	
	/**
	 * 跳转到Address页面
	 * @return
	 */
	@RequestMapping("/toAddress")
	public String toAddress() {
		return "address";
	}
	
	/**
	 * 根据id查询用户
	 * @param uid
	 * @return
	 */
	@RequestMapping("/findById")
	@ResponseBody
	public Users findById(Integer uid) {
		return service.findById(uid);
	}
	
	/**
	 * 更新客户
	 * @param user
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public String update(@RequestBody Users user) {
		return service.update(user);
	}
}
