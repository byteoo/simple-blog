package com.shaoyu.simple_blog.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryshowController {

	/**
	 *
	 * @param id
	 * @return 返回分类文章列表
	 */
	@GetMapping("categories/{id}")
	public Object categories(@PathVariable Long id){
		return null;
	}
}
