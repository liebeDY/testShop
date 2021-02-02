package com.example.demo.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

		void insert(Member m);
		
		Member select(String id);
		Member selectnick(String nickname);
		
		void update(Member m);
		
		void delete(String id);
	
	
}
