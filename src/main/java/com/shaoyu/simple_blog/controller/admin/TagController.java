package com.shaoyu.simple_blog.controller.admin;

import com.shaoyu.simple_blog.DO.Tag;
import com.shaoyu.simple_blog.DO.Tag;
import com.shaoyu.simple_blog.service.TagService;
import com.shaoyu.simple_blog.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
@Api("标签管理")
public class TagController {

	@Autowired
	private TagService tagService;

	/**
	 * 查询所有分类
	 *
	 * @return
	 */
	@GetMapping("tags")
	@ApiOperation("查询所有分类")
	public ResponseEntity<List<Tag>> listTag() {
		List<Tag> tagList = tagService.listTag();
		if (CollectionUtils.isEmpty(tagList)) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(tagList);
	}

	/**
	 * 新增
	 *
	 * @return
	 */
	@PostMapping("/tags")
	@ApiOperation("新增")
	public ResponseEntity post(@RequestParam String name) {
		if (1 == tagService.insert(name)) {
			return ResponseEntity.accepted().build();
		}
		return ResponseEntity.notFound().build();
	}

	/**
	 * 修改
	 *
	 * @param id
	 * @return
	 */

	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@ApiOperation("删除")
	@DeleteMapping("/tags/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		if (1 == tagService.deleteTag(id)) {
			return ResponseEntity.accepted().build();
		}
		return ResponseEntity.notFound().build();
	}

}
