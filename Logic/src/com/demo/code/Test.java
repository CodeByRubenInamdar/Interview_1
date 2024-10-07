package com.demo.code;

public class Test {
	public static void main(String[] args) {
		Collage collage = new Collage();
		collage.setColl_Name("K.J.Somiya Colleage Kopargoan");
		collage.setColl_City("Kopergoan");
		collage.setPincode(414105);

		System.out.println(collage);

		Teacher teacher = new Teacher();
		teacher.setTech_id("1");
		teacher.setTeac_name("Vipul");
		teacher.setTech_dept("BCA");

		System.out.println(teacher);

		Student s1 = new Student();
		s1.setStud_name("Ruben");
		s1.setStud_dept("BCA");
		s1.setStud_id(1);
		
		System.out.println(s1);
	}
}
