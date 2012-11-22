package day9;

public class Female
{

	private int id;
	
	private String name;
	
	private Male male;

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

	public Male getMale()
	{
		return male;
	}

	public void setMale(Male male)
	{
		this.male = male;
	}
	
	public String toString ()
	{
		return "["+id+","+name+","+male.getId()+"]";
	}
}
