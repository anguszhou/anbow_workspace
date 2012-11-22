package com.ambow.hibenate.m2m;

import java.util.HashSet;
import java.util.Set;

public class AmbowCourse {

	private int id;
	
	private String cname;
	
	private Set students = new HashSet();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set getStudents() {
		return students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}
}
