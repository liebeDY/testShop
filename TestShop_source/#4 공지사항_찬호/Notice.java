package com.example.testshop.admin;

import java.sql.Date;

public class Notice {
	
	private int n_num;
	private String n_title;
	private String n_content;
	private Date n_date;
	private int n_hits;

	public Notice() {
		super();
	}

	public Notice(int n_num, String n_title, String n_content, Date n_date, int n_hits) {
		super();
		this.n_num = n_num;
		this.n_title = n_title;
		this.n_content = n_content;
		this.n_date = n_date;
		this.n_hits = n_hits;
	}

	public int getN_num() {
		return n_num;
	}

	public void setN_num(int n_num) {
		this.n_num = n_num;
	}

	public String getN_title() {
		return n_title;
	}

	public void setN_title(String n_title) {
		this.n_title = n_title;
	}

	public String getN_content() {
		return n_content;
	}

	public void setN_content(String n_content) {
		this.n_content = n_content;
	}

	public Date getN_date() {
		return n_date;
	}

	public void setN_date(Date n_date) {
		this.n_date = n_date;
	}

	public int getN_hits() {
		return n_hits;
	}

	public void setN_hits(int n_hits) {
		this.n_hits = n_hits;
	}

	@Override
	public String toString() {
		return "Notice [n_num=" + n_num + ", n_title=" + n_title + ", n_content=" + n_content + ", n_date=" + n_date
				+ ", n_hits=" + n_hits + "]";
	}

}
