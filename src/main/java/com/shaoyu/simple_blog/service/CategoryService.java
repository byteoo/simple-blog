package com.shaoyu.simple_blog.service;

import com.shaoyu.simple_blog.DO.Category;

import java.util.List;

public interface CategoryService {
	List<Category> listCategory();

	int deleteCategory(Long id);

	int updateCategory(Category category);

	int insertCategory(Category category);
}

