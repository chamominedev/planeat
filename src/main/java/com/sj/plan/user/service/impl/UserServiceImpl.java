package com.sj.plan.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.plan.user.mapper.UserMapper;
import com.sj.plan.user.model.ShippingAddressVo;
import com.sj.plan.user.model.UserVo;
import com.sj.plan.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserVo insert(UserVo userVo) {
		return userMapper.insert(userVo);
	}

	@Override
	public UserVo select(UserVo userVo) {
		return userMapper.select(userVo);
	}

	@Override
	public UserVo update(UserVo userVo) {
		return userMapper.update(userVo);
	}

	@Override
	public UserVo delete(UserVo userVo) {
		return userMapper.delete(userVo);
	}

	@Override
	public ShippingAddressVo saInsert(ShippingAddressVo shippingAddressVo) {
		return userMapper.saInsert(shippingAddressVo);
	}

	@Override
	public ShippingAddressVo saSelect(ShippingAddressVo shippingAddressVo) {
		return userMapper.saSelect(shippingAddressVo);
	}

	@Override
	public ShippingAddressVo saUpdate(ShippingAddressVo shippingAddressVo) {
		return userMapper.saUpdate(shippingAddressVo);
	}

	@Override
	public ShippingAddressVo saDelete(ShippingAddressVo shippingAddressVo) {
		return userMapper.saDelete(shippingAddressVo);
	}

}