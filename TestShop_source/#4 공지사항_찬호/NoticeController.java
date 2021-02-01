package com.example.testshop.admin;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoticeController {

	@Autowired
	private NoticeService service;
	
	
	// 공지사항 작성 폼으로 이동
	@GetMapping(value = "/admin/NoticeForm")
	public void noticeForm() {
		
	}
	
	// 공지사항 작성
	@RequestMapping(value = "/admin/NoticeForm")
	public String insert(Notice n) {
		service.insertNotice(n);
		return "redirect:/admin/list";
	}
	
	@RequestMapping(value = "/admin/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("/admin/NoticeList");
		ArrayList<Notice> list = (ArrayList<Notice>) service.selectAllNotice();
		mav.addObject("list", list);
		return mav;
	}
	
}
