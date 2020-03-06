package com.shaoyu.simple_blog.DO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-shaoyu-simple_blog-DO-Tag")
@Data
public class Tag {
    /**
    * 标签id
    */
    @ApiModelProperty(value="标签id")
    private Long id;

    /**
    * 标签名称
    */
    @ApiModelProperty(value="标签名称")
    private String name;
}