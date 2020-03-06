package com.shaoyu.simple_blog.DO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-shaoyu-simple_blog-DO-BlogTag")
@Data
public class BlogTag {
    /**
    * 文章标签关联id
    */
    @ApiModelProperty(value="文章标签关联id")
    private Long id;

    /**
    * 文章id
    */
    @ApiModelProperty(value="文章id")
    private Long blogId;

    /**
    * 标签id
    */
    @ApiModelProperty(value="标签id")
    private Long tagId;
}