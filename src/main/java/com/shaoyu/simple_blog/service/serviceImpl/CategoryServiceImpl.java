package com.shaoyu.simple_blog.service.serviceImpl;

import com.shaoyu.simple_blog.DO.Category;
import com.shaoyu.simple_blog.repository.CategoryRepository;
import com.shaoyu.simple_blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	@Transactional
	public List<Category> listCategory() {
		return categoryRepository.listAll();
	}

	@Override
	public int deleteCategory(Long id) {
		return categoryRepository.deleteCategory(id);
	}

	@Override
	public int updateCategory(Category category) {
		return categoryRepository.updateCategory(category);
	}

	@Override
	public int insertCategory(Category category) {
		return categoryRepository.insertCategory(category);
	}
}
