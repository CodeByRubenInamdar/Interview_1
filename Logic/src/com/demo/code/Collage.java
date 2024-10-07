package com.demo.code;

public class Collage {
	private String Coll_Name;
	private String Coll_City;
	private int pincode;
	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collage(String coll_Name, String coll_City, int pincode) {
		super();
		Coll_Name = coll_Name;
		Coll_City = coll_City;
		this.pincode = pincode;
	}
	public String getColl_Name() {
		return Coll_Name;
	}
	public void setColl_Name(String coll_Name) {
		Coll_Name = coll_Name;
	}
	public String getColl_City() {
		return Coll_City;
	}
	public void setColl_City(String coll_City) {
		Coll_City = coll_City;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Collage [Coll_Name=" + Coll_Name + ", Coll_City=" + Coll_City + ", pincode=" + pincode + "]";
	}
	
	
	
}
