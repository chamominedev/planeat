package com.sj.plan.product.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sj.plan.product.model.ProductVo;

@Mapper
public interface ProductMapper {
	ProductVo insert(ProductVo productVo);
	ProductVo select(ProductVo productVo);
	ProductVo update(ProductVo productVo);
	ProductVo delete(ProductVo productVo);
}