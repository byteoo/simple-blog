package com.shaoyu.simple_blog.mapper;

import com.shaoyu.simple_blog.DO.BlogTag;

public interface BlogTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BlogTag record);

    int insertSelective(BlogTag record);

    BlogTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogTag record);

    int updateByPrimaryKey(BlogTag record);
}