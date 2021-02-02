package com.example.demo.admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
	
	// 카테고리 등록(추가)
	void insertC1(Category c);
	void insertC2(Category c);
	void insertC3(Category c);
	
	// 카테고리 선택
	Category selectC1(int num);
	Category selectC2(int num);
	Category selectC3(int num);
	
	// 카테고리 전체선택
	List selectAllC1();
	List selectAllC2(int p_num);
	List selectAllC3(int p_num);
	
	// 카테고리 수정
	void updateC1(Category c);
	void updateC2(Category c);
	void updateC3(Category c);
	
	// 카테고리 삭제
	void deleteC1(int num);
	void deleteC2(int num);
	void deleteC3(int num);	
	
}
