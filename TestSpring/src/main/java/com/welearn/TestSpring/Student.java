package com.welearn.TestSpring;

public class Student {
	private Integer studentid;
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	private String studentname;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student id =>" + studentid + "student name = >" +studentname;
	}
	
	public void destroy()
	{
		System.out.println("i am leaving");
	}
	
	public void init()
	{
		System.out.println("i am coming");
	}
}
