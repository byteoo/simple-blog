package com.shaoyu.simple_blog.repository;

import com.shaoyu.simple_blog.DO.Category;
import com.shaoyu.simple_blog.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepository {

	@Autowired
	private CategoryMapper categoryMapper;

	public List<Category> listAll() {
		return categoryMapper.selectAll();
	}

	public int deleteCategory(Long id) {
		return categoryMapper.deleteByPrimaryKey(id);
	}

	public int insertCategory(Category category) {

		// 如果id存在，则调用updateCategory
		if (categoryMapper.selectByPrimaryKey(category.getId()) != null) {
			new ResponseEntity<String>("id已存在", HttpStatus.BAD_REQUEST);
			updateCategory(category);
		}
		return categoryMapper.insertSelective(category);
	}

	public int updateCategory(Category category) {
		return 0;
	}
}
