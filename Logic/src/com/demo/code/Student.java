package com.demo.code;

public class Student {
	private int stud_id;
	private String stud_name;
	private String stud_dept;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stud_id, String stud_name, String stud_dept) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_dept = stud_dept;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getStud_dept() {
		return stud_dept;
	}

	public void setStud_dept(String stud_dept) {
		this.stud_dept = stud_dept;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_dept=" + stud_dept + "]";
	}
	

}
