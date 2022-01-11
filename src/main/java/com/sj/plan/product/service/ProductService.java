package com.sj.plan.product.service;

import com.sj.plan.product.model.ProductVo;

public interface ProductService {
	ProductVo insert(ProductVo productVo);
	ProductVo select(ProductVo productVo);
	ProductVo update(ProductVo productVo);
	ProductVo delete(ProductVo productVo);
}
