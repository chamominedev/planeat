package com.sj.plan.user.service;

import com.sj.plan.user.model.ShippingAddressVo;
import com.sj.plan.user.model.UserVo;

public interface UserService {
	UserVo insert(UserVo userVo);
	UserVo select(UserVo userVo);
	UserVo update(UserVo userVo);
	UserVo delete(UserVo userVo);
	
	// 회원 배송지
	ShippingAddressVo saInsert(ShippingAddressVo shippingAddressVo);
	ShippingAddressVo saSelect(ShippingAddressVo shippingAddressVo);
	ShippingAddressVo saUpdate(ShippingAddressVo shippingAddressVo);
	ShippingAddressVo saDelete(ShippingAddressVo shippingAddressVo);
}
