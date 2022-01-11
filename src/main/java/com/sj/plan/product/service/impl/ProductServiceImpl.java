package com.sj.plan.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.plan.product.mapper.ProductMapper;
import com.sj.plan.product.model.ProductVo;
import com.sj.plan.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	@Override
	public ProductVo insert(ProductVo productVo) {
		return productMapper.insert(productVo);
	}

	@Override
	public ProductVo select(ProductVo productVo) {
		return null;
	}

	@Override
	public ProductVo update(ProductVo productVo) {
		return null;
	}

	@Override
	public ProductVo delete(ProductVo productVo) {
		return null;
	}

}