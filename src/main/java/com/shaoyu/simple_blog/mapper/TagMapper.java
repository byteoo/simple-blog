package com.shaoyu.simple_blog.mapper;

import com.shaoyu.simple_blog.DO.Tag;

import java.util.List;

public interface TagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tag record);

    int insertSelective(Tag record);

    Tag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKey(Tag record);

	List<Tag> selectAll();

    int insertTag(String name);
}