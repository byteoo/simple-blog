package com.shaoyu.simple_blog.service.serviceImpl;

import com.shaoyu.simple_blog.DO.Blog;
import com.shaoyu.simple_blog.repository.BlogRepository;
import com.shaoyu.simple_blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepository blogRepository;

	@Override
	public Blog getBlogById(Long id) {
		return blogRepository.selectById(id);
	}

	@Override
	public List<Blog> listBlogByTagId(Long tagId) {
		return null;
	}

	@Override
	public List<Blog> listBlogByCategoryId(Long categoryId) {
		return null;
	}

	@Override
	public Long countBlog() {
		return blogRepository.count();
	}

	@Override
	public int saveBlog(Blog blog) {
		if (blog.getId()==null){
			blog.setCreateTime(new Date());
			blog.setUpdateTime(new Date());
			blog.setViews(0);
		}else {
			blog.setUpdateTime(new Date());
		}
		return blogRepository.insertBlog(blog);
	}

	@Override
	public int updateBlog(Blog blog) {
		blog.setUpdateTime(new Date());
		return blogRepository.updateBlog(blog);
	}

	@Override
	public int deleteBlog(Long id) {
		return blogRepository.deleteBlog(id);
	}
}
