package day9;

public class Male
{

	private int id;
	
	private String name;
	
	private Female female;

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

	public Female getFemale()
	{
		return female;
	}

	public void setFemale(Female female)
	{
		this.female = female;
	}
	
	public String toString ()
	{
		return "["+id+","+name+","+female.getId()+"]";
	}
	
}
