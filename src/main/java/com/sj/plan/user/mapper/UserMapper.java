package com.sj.plan.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sj.plan.user.model.ShippingAddressVo;
import com.sj.plan.user.model.UserVo;

@Mapper
public interface UserMapper {
	UserVo insert(UserVo userVo);	// 회원가입
	UserVo select(UserVo userVo);	// 닉네임 중복확인, 로그인, 조회 ( command를 통한 return 구분 )
	UserVo update(UserVo userVo);	// 수정
	UserVo delete(UserVo userVo);	// 삭제
	
	// 회원 배송지
	ShippingAddressVo saInsert(ShippingAddressVo shippingAddressVo);
	ShippingAddressVo saSelect(ShippingAddressVo shippingAddressVo);
	ShippingAddressVo saUpdate(ShippingAddressVo shippingAddressVo);
	ShippingAddressVo saDelete(ShippingAddressVo shippingAddressVo);
}	