package com.shaoyu.simple_blog.repository;

import com.shaoyu.simple_blog.DO.Blog;
import com.shaoyu.simple_blog.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BlogRepository {

	@Autowired
	private BlogMapper blogMapper;

	public Blog selectById(Long id) {
		return blogMapper.selectByPrimaryKey(id);
	}

	public int insertBlog(Blog blog) {
		return blogMapper.insert(blog);
	}

	public int updateBlog(Blog blog) {
		return blogMapper.updateByPrimaryKeySelective(blog);
	}

	public int deleteBlog(Long id) {
		return blogMapper.deleteByPrimaryKey(id);
	}

	public Long count() {
		return blogMapper.count();
	}
}
