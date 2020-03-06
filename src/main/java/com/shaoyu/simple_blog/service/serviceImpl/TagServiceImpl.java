package com.shaoyu.simple_blog.service.serviceImpl;

import com.shaoyu.simple_blog.DO.Tag;
import com.shaoyu.simple_blog.repository.CategoryRepository;
import com.shaoyu.simple_blog.repository.TagRepository;
import com.shaoyu.simple_blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

	@Autowired
	private TagRepository tagRepository;

	@Override
	@Transactional
	public List<Tag> listTag() {
		return tagRepository.listAll();
	}

	@Override
	@Transactional
	public int insert(String name) {
		return tagRepository.insertTag(name);
	}

	@Override
	@Transactional
	public int deleteTag(Long id) {
		return tagRepository.deleteTag(id);
	}
}
