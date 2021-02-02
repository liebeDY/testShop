package com.example.demo.admin;

public class Category {

	private int num; // 카테고리 번호
	private String name; // 카테고리 이름
	private int p_num; // 상위 카테고리 번호

	// 생성자 3개
	public Category() {
	}

	public Category(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public Category(int num, String name, int p_num) {
		this.num = num;
		this.name = name;
		this.p_num = p_num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getP_num() {
		return p_num;
	}

	public void setP_num(int p_num) {
		this.p_num = p_num;
	}

	@Override
	public String toString() {
		return "Category [num=" + num + ", name=" + name + ", p_num=" + p_num + "]";
	}

}
