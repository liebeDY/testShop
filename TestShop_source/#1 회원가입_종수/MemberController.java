package com.example.demo.member;

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
public class MemberController {

	@Autowired
	private MemberService service;

	@GetMapping(value = "/member/login")
	public void login() {

	}

	@RequestMapping(value = "/member/reg_form")
	public void form(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("idCheck", false);
		session.setAttribute("nickCheck", false);
	}

//	@GetMapping(value="/member/reg_agree")
//	public String agree() {
//		
//		//return "redirect:/member/reg_agree";
//	}
	@RequestMapping("/member/reg_agree")
	public void regAgree() {

//		return "redirect:/member/reg_agree";
	}

	@RequestMapping(value = "/member/idCheck")
	public ModelAndView idCheck(HttpServletRequest req, @RequestParam(value = "id") String id) {

		System.out.println(id);
		HttpSession session = req.getSession();
		ModelAndView mav = new ModelAndView("/member/idCheck");
		String result = "";
		Member m = service.getMember(id);
		if (m == null) {
			result = "사용가능";
			session.setAttribute("idCheck", true);
		} else {
			result = "불가";
			session.setAttribute("idCheck", false);
		}
		System.out.println(session.getAttribute("idCheck"));
		mav.addObject("result", result);
		return mav;

	}

	@RequestMapping(value = "/member/nickCheck")
	public ModelAndView nickCheck(HttpServletRequest req, @RequestParam(value = "nickname") String nickname) {

		System.out.println(nickname);
		HttpSession session = req.getSession();
		ModelAndView mav = new ModelAndView("/member/nickCheck");
		String result = "";
		Member m = service.getNickname(nickname);
		if (m == null) {
			result = "가능";
			session.setAttribute("nickCheck", true);
		} else {
			result = "중복된 닉네임";
			session.setAttribute("nickCheck", false);
		}
		System.out.println(session.getAttribute("nickCheck"));
		mav.addObject("result", result);

		return mav;
	}

	@RequestMapping(value = "/member/register")
	public String join(Member m) {
		service.addMember(m);
		return "/member/login";
	}

	@RequestMapping(value = "/member/login")
	public String login(HttpServletRequest req, Member m) {
		Member m2 = service.getMember(m.getId());
		if (m2 == null || !m2.getPwd().equals(m.getPwd())) {
			System.out.println("존재하지 않는 id 또는 비밀번호 입니다.");
			return "member/login";
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("id", m2.getId());
			session.setAttribute("type", m2.getType());
			return "member/main";
		}

	}

	@RequestMapping(value = "/member/editForm")
	public ModelAndView editForm(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("member/edit");
		HttpSession session = req.getSession(false);
		String id = (String) session.getAttribute("id");
		Member m = service.getMember(id);
		mav.addObject("m", m);
		return mav;
	}

	@RequestMapping(value = "/member/edit")
	public String edit(Member m) {
		service.editMember(m);
		return "member/main";
	}

	@RequestMapping(value = "member/logout")
	public String logout(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		session.removeAttribute("id");
		session.invalidate();
		return "member/login";
	}

	@RequestMapping(value = "/member/out")
	public String out(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		String id = (String) session.getAttribute("id");
		service.delMember(id);
		session.removeAttribute("id");
		session.invalidate();
		return "member/login";

	}

	@RequestMapping(value = "/member/order")
	public String orderPage() {
		return "member/order";
	}

	@RequestMapping(value = "member/prodPage")
	public String prodPage() {
		return "member/prodPage";
	}

	@RequestMapping(value = "/member/adminPage")
	public String adminPage() {

		return "member/adminPage";
	}

}
