package com.shaoyu.simple_blog.DO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-shaoyu-simple_blog-DO-Blog")
@Data
public class Blog {
	/**
	 * 文章id
	 */
	@ApiModelProperty(value = "文章id")
	private Long id;

	/**
	 * 作者id
	 */
	@ApiModelProperty(value = "作者id")
	private Long userId;

	/**
	 * 分类id
	 */
	@ApiModelProperty(value = "分类id")
	private Long categoryId;

	/**
	 * 标题
	 */
	@ApiModelProperty(value = "标题")
	private String title;

	/**
	 * 正文
	 */
	@ApiModelProperty(value = "正文")
	private String content;

	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private Date createTime;

	/**
	 * 评论开关
	 */
	@ApiModelProperty(value = "评论开关")
	private String commentabled;

	/**
	 * 更新时间
	 */
	@ApiModelProperty(value = "更新时间")
	private Date updateTime;

	/**
	 * 预览
	 */
	@ApiModelProperty(value = "预览")
	private String preview;

	/**
	 * 浏览量
	 */
	@ApiModelProperty(value = "浏览量")
	private Integer views;

	/**
	 * 发布开关
	 */
	@ApiModelProperty(value = "发布开关")
	private String published;
}