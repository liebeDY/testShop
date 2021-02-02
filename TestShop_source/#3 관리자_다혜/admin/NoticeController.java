package com.example.demo.admin;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoticeController {

	@Autowired
	private NoticeService service;

	// 공지사항 작성 폼으로 이동
	@GetMapping(value = "/admin/NoticeForm")
	public void noticeForm() {

	}

	// 컨텐츠로 이동
	@RequestMapping(value = "/admin/content")
	public ModelAndView content(@RequestParam(value = "n_num") int n_num) {
		ModelAndView mav = new ModelAndView("/admin/NoticeContent");
		Notice n = service.selectNotice(n_num);
		mav.addObject("n", n);
		service.noticeHits(n_num);
		return mav;
	}

	// 공지사항 작성
	@RequestMapping(value = "/admin/NoticeForm")
	public String insert(Notice n) {
		service.insertNotice(n);
		return "redirect:/admin/list";
	}

	// 공지사항 전체 출력
	@RequestMapping(value = "/admin/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("/admin/NoticeList");
		ArrayList<Notice> list = (ArrayList<Notice>) service.selectAllNotice();
		mav.addObject("list", list);
		return mav;
	}

	// 공지사항 수정
	@RequestMapping(value = "/admin/edit")
	public String edit(Notice n) {
		service.editNotice(n);
		return "redirect:/admin/list";
	}

	// 공지사항 삭제
	@RequestMapping(value = "/admin/delete")
	public String delete(@RequestParam(value = "n_num") int n_num) {
		service.deleteNotice(n_num);
		return "redirect:/admin/list";
	}

}
