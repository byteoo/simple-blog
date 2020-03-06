package com.shaoyu.simple_blog.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogshowController {

	/**
	 * 首页
	 * @return
	 */
	@GetMapping("/")
	public Object index(){
		return null;
	}

	@GetMapping("/blog/{id}")
	public String blog(@PathVariable Long id) {
		return null;
	}
}
