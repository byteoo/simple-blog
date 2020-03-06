package com.shaoyu.simple_blog.controller.admin;

import com.shaoyu.simple_blog.DO.Blog;
import com.shaoyu.simple_blog.service.BlogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
@Api("博客管理")
public class BlogController {

	@Autowired
	private BlogService blogService;
	/**
	 * 博客列表
	 * @return
	 */
	@GetMapping("blogs")
	@ApiOperation(value = "显示列表")
	public List<Blog> blogs(){
		return null;
	}

	/**
	 * 新增 或 修改
	 * @return
	 */
	@PostMapping("/blogs")
	@ApiOperation(value = "新增博客")
	public Object post(@RequestBody Blog blog){
		return blogService.saveBlog(blog);
	}

	@DeleteMapping("/blogs/{id}")
	@ApiOperation(value = "删除博客")
	public ResponseEntity delete(@PathVariable Long id){
		if (blogService.deleteBlog(id)==1){
			return ResponseEntity.accepted().build();
		}else {
			return ResponseEntity.notFound().build();
		}


	}

}
