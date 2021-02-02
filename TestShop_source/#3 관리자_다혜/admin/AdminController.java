package com.example.demo.admin;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

	@Autowired
	private AdminService service;

	// 홈페이지 관리
	@GetMapping("/admin/admin")
	public void admin() {

	}

	// ----- 카테고리 관리 -----
	@RequestMapping("/admin/adminCategory")
	public void adminCategoryForm() {

	}

	// DB에 카테고리 추가 (페이지X)
	// adminCategory 페이지에서 추가 버튼 눌렀을 때
	@RequestMapping(value = "/admin/addCategory")
	public String addCategory(Category c, @RequestParam(value = "type") int type) {
		service.addCategory(c, type);
		return "/admin/adminCategory";
	}

	// 화면에 카테고리 출력
	@RequestMapping(value = "/admin/getSub")
	public ModelAndView getSub(@RequestParam(value="p_num") int p_num, @RequestParam(value="type") int type) {
		ModelAndView mav = new ModelAndView("/admin/getSub");
		ArrayList<Category> list = null;
		switch (type) {
		case 1:
			list = (ArrayList<Category>) service.getAll(0, 1);
			break;
		case 2:
			list = (ArrayList<Category>) service.getAll(p_num, 2);
			break;
		case 3:
			list = (ArrayList<Category>) service.getAll(p_num, 3);
			break;
		}
		mav.addObject("list", list);
		return mav;
	}
	
	// 카테고리 삭제
	@RequestMapping(value="/admin/delCategory")
	public String delCategory(@RequestParam(value="num") int num, @RequestParam(value="type") int type) {
		service.deleteCategory(num, type);
		return "/admin/adminCategory";
	}
	

	// ----- 회원 관리 -----
	@GetMapping("/admin/adminMember")
	public void adminMember() {
	}

	// ----- 상품 관리 -----
	@GetMapping("/admin/adminProduct")
	public void adminProduct() {

	}

	// ----- 후기 관리 -----
	@GetMapping("/admin/adminReview")
	public void adminReview() {
	}
}
