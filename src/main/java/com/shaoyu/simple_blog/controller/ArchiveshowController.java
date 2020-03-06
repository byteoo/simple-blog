package com.shaoyu.simple_blog.controller;

import com.shaoyu.simple_blog.DO.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding.Use;

@RestController
public class ArchiveshowController {

	/**
	 *
	 * @return 文章数量，文章列表
	 */
	@GetMapping("/archives")
	public Object archives(){
		return null;
	}
}
