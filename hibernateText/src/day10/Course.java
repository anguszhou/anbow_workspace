package day10;

import java.util.HashSet;
import java.util.Set;

public class Course
{
	private int id;
	
	private String name;
	
	private Set teachers=new HashSet();

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Set getTeachers()
	{
		return teachers;
	}

	public void setTeachers(Set teachers)
	{
		this.teachers = teachers;
	}
	
	

}
