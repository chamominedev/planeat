package com.sj.plan.product.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sj.plan.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

}
