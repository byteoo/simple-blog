package com.shaoyu.simple_blog.service;

import com.shaoyu.simple_blog.DO.Blog;

import java.util.List;

public interface BlogService {

	/**
	 * 获取文章详情
	 * @param id
	 * @return
	 */
	Blog getBlogById(Long id);

	/**
	 * 根据标签获取对应文章
	 * @param tagId
	 * @return
	 */
	List<Blog> listBlogByTagId(Long tagId);

	/**
	 * 根据分类获取文章
	 * @param categoryId
	 * @return
	 */
	List<Blog> listBlogByCategoryId(Long categoryId);

	/**
	 * 文章计数
	 * @return
	 */
	Long countBlog();

	/**
	 * 保存/新增文章
	 * @param blog
	 * @return
	 */
	int saveBlog(Blog blog);

	/**
	 * 更新文章
	 * @param blog
	 * @return
	 */
	int updateBlog(Blog blog);

	/**
	 * 删除文章
	 * @param id
	 * @return
	 */
	int deleteBlog(Long id);

}
