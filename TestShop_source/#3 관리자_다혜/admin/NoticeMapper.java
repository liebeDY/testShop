package com.example.demo.admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {

	void insertNotice(Notice n);		// 공지 업로드
	
	Notice selectNotice(int n_num);		// 시퀀스 번호로 얻어오기
	
	List selectAllNotice();				// 전체출력
	
	void editNotice(Notice n); 			// 수정
	
	void noticeHits(int n_num); 			// 조회수
	
	void deleteNotice(int n_num);			// 삭제
}
