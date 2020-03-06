package com.shaoyu.simple_blog.DO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-shaoyu-simple_blog-DO-Category")
@Data
public class Category {
	/**
	 * 分类id
	 */
	@ApiModelProperty(value = "分类id")
	private Long id;

	/**
	 * 分类名称
	 */
	@ApiModelProperty(value = "分类名称")
	private String name;

	/**
	 * 分类描述
	 */
	@ApiModelProperty(value = "分类描述")
	private String desc;
}