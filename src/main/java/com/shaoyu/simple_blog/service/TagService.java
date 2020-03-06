package com.shaoyu.simple_blog.service;

import com.shaoyu.simple_blog.DO.Tag;

import java.util.List;

public interface TagService {
	List<Tag> listTag();

	int insert(String name);

	int deleteTag(Long id);

}
