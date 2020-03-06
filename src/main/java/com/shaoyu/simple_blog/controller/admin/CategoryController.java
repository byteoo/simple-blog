package com.shaoyu.simple_blog.controller.admin;

import com.shaoyu.simple_blog.DO.Category;
import com.shaoyu.simple_blog.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * GET：读取（Read）
 * POST：新建（Create）
 * PUT：更新（Update）
 * PATCH：更新（Update），通常是部分更新
 * DELETE：删除（Delete）
 */
@RestController
@RequestMapping("/admin")
@Api("分类管理")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	/**
	 * 查询所有分类
	 *
	 * @return
	 */
	@GetMapping("categories")
	@ApiOperation("查询所有分类")
	public ResponseEntity<List<Category>> listCategory() {
		List<Category> categoryList = categoryService.listCategory();
		if (CollectionUtils.isEmpty(categoryList)) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(categoryList);
	}

	/**
	 * 新增
	 *
	 * @return
	 */
	@PostMapping("/category")
	@ApiOperation("新增")
	public ResponseEntity insertCategory(@RequestBody Category category) {
		if (1 == categoryService.insertCategory(category)) {
			return ResponseEntity.accepted().build();
		}
		return ResponseEntity.notFound().build();
	}

	/**
	 * 修改
	 *
	 * @param category
	 * @return
	 */

	@PatchMapping("/category")
	@ApiOperation("更新")
	public ResponseEntity updateCategory(@RequestBody Category category) {
		if (1 == categoryService.updateCategory(category)) {
			return ResponseEntity.accepted().build();
		}
		return ResponseEntity.notFound().build();
	}

	/**
	 * 删除
	 *
	 * @param id
	 * @return
	 */
	@ApiOperation("删除")
	@DeleteMapping("/categories/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		if (1 == categoryService.deleteCategory(id)) {
			return ResponseEntity.accepted().build();
		}
		return ResponseEntity.notFound().build();
	}

}
