package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.AddressMapper;
import com.accp.dao.UsersMapper;
import com.accp.domain.Address;
import com.accp.domain.AddressExample;
import com.accp.domain.Users;

@Service
@Transactional
public class UsersService {

	@Autowired
	private UsersMapper mapper;
	
	@Autowired
	private AddressMapper amapper;
	
	/**
	 * 根据id查询客户
	 * @param id
	 * @return
	 */
	public Users findById(Integer uid) {
		Users user = mapper.selectByPrimaryKey(uid);
		
		if(user != null) {
			AddressExample example = new AddressExample();
			example.createCriteria().andUidEqualTo(uid);
			List<Address> address = amapper.selectByExample(example);
			
			user.setAddress(address);
		}
		return user;
	}
	
	/**
	 * 更新客户
	 * @param user
	 * @return
	 */
	public String update(Users user) {
		Users us = mapper.selectByPrimaryKey(user.getUid());
		//当用户不存在时新增
		if(us == null) {
			int count1 = mapper.insert(user);
			if(count1 > 0) {
				for (Address add : user.getAddress()) {
					add.setUid(user.getUid());
					try {
						int count2 = amapper.insert(add);
					} catch (Exception e) {
						return "00003";
					}
				}
			}
			return "00000";
		}
		
		AddressExample example = new AddressExample();
		example.createCriteria().andUidEqualTo(user.getUid()).andSidEqualTo(user.getAddress().get(0).getSid());
		List<Address> address = amapper.selectByExample(example);
		//当地址存在时则修改
		if (address.size() > 0) {
			int count3 = mapper.updateByPrimaryKey(user);
			for (Address add : user.getAddress()) {
				int count4 = amapper.updates(add);
			}
			return "00001";
		} else {
			//修改基本客户信息并新增地址
			int count5 = mapper.updateByPrimaryKey(user);
			for (Address add : user.getAddress()) {
				add.setUid(user.getUid());
				try {
					int count6 = amapper.insert(add);
				} catch (Exception e) {
					return "00003";
				}
			}
			return "00002";
		}
	}
}
