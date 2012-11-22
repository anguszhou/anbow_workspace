package day10;

public class Test
{

	/**
	 * @param args
	 */

	public static void main(String[] args)
	{
		Classes c1=new Classes();
		
		c1.setClassname("1.3");
		
		Student s1=new Student();
		
		s1.setName("lili");
		
		s1.setClassid(c1);
		
        Student s2=new Student();
		
		s2.setName("zhang");
		
		s2.setClassid(c1);
		
        Student s3=new Student();
		
		s3.setName("wang");
		
		s3.setClassid(c1);
				
		c1.getStudents().add(s1);
		
		c1.getStudents().add(s2);
		
		c1.getStudents().add(s3);
		
		System.out.println(c1.getStudents().size());
		
		IClassDao dao=new ClassDaoImpl();
		
		dao.addClass(c1);

	}

}
