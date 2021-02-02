package com.example.demo.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

	@Autowired
	private CategoryMapper mapper;

	// 카테고리 등록(추가)
	public void addCategory(Category c, int type) {
		switch (type) {
		case 1:
			mapper.insertC1(c);
			break;
		case 2:
			mapper.insertC2(c);
			break;
		case 3:
			mapper.insertC3(c);
			break;
		}
	}

	// 카테고리 선택
	public Category getCategory(int num, int type) {
		Category c = null;
		switch (type) {
		case 1:
			c = mapper.selectC1(num);
			break;
		case 2:
			c = mapper.selectC2(num);
			break;
		case 3:
			c = mapper.selectC3(num);
			break;
		}
		return c;
	};

	// 카테고리 전체선택
	public List getAll(int p_num, int type) {
		List list = null;
		switch (type) {
		case 1:
			list = mapper.selectAllC1();
			break;
		case 2:
			list = mapper.selectAllC2(p_num);
			break;
		case 3:
			list = mapper.selectAllC3(p_num);
			break;
		}
		return list;
	}

	// 카테고리 수정
	public void editCategory(Category c, int type) {
		switch (type) {
		case 1:
			mapper.updateC1(c);
			break;
		case 2:
			mapper.updateC2(c);
			break;
		case 3:
			mapper.updateC3(c);
			break;
		}
	}

	// 카테고리 삭제
	public void deleteCategory(int num, int type) {
		switch (type) {
		case 1:
			mapper.deleteC1(num);
			break;
		case 2:
			mapper.deleteC1(num);
			break;
		case 3:
			mapper.deleteC1(num);
			break;
		}
	}
}
