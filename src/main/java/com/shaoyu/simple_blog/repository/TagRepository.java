package com.shaoyu.simple_blog.repository;

import com.shaoyu.simple_blog.DO.Tag;
import com.shaoyu.simple_blog.mapper.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TagRepository {
	@Autowired
	private TagMapper tagMapper;

	public List<Tag> listAll() {
		return tagMapper.selectAll();
	}

	public int insertTag(String name) {
		return tagMapper.insertTag(name);
	}

	public int deleteTag(Long id) {
		return tagMapper.deleteByPrimaryKey(id);
	}
}
