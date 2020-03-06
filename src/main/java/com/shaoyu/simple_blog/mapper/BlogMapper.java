package com.shaoyu.simple_blog.mapper;

import com.shaoyu.simple_blog.DO.Blog;

public interface BlogMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);

    /**
     * 文章计数
     * @return
     */
	Long count();
}