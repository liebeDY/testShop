package com.example.testshop.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeMapper mapper;
	
	public void insertNotice(Notice n) {
		mapper.insertNotice(n);
	}
	
	public Notice selectNotice(int n_num) {
		return mapper.selectNotice(n_num);
	}
	
	public List selectAllNotice() {
		return mapper.selectAllNotice();
	}
	
	public void editNotice(Notice n) {
		mapper.editNotice(n);
	}
	
	public void noticeHits(int n_num) {
		mapper.noticeHits(n_num);
	}
	
	public void deleteNotice(int n_num) {
		mapper.deleteNotice(n_num);
	}
}
