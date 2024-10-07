package com.demo.code;

public class Teacher {
	private String tech_id;
	private String teac_name;
	private String tech_dept;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String tech_id, String teac_name, String tech_dept) {
		super();
		this.tech_id = tech_id;
		this.teac_name = teac_name;
		this.tech_dept = tech_dept;
	}

	public String getTech_id() {
		return tech_id;
	}

	public void setTech_id(String tech_id) {
		this.tech_id = tech_id;
	}

	public String getTeac_name() {
		return teac_name;
	}

	public void setTeac_name(String teac_name) {
		this.teac_name = teac_name;
	}

	public String getTech_dept() {
		return tech_dept;
	}

	public void setTech_dept(String tech_dept) {
		this.tech_dept = tech_dept;
	}

	@Override
	public String toString() {
		return "Teacher [tech_id=" + tech_id + ", teac_name=" + teac_name + ", tech_dept=" + tech_dept + "]";
	}

}
