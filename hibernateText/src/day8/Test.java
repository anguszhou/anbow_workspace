package day8;

import java.util.Iterator;
import java.util.List;



public class Test
{	
	public static void main(String[] args)
	{
        Student student=new Student("nishishei","1wew3");
        
       /* Student stu2=new Student(3,"zcoug","12wef3");
        
        Student stu3=new Student(4,"mao","dfgdfs");
        
        Student stu4=new Student(5,"dongdf","gdfgf");
        
        Student stu5=new Student(6,"lili","gdfgsgdfg");*/
        
        
        IStudentDao dao= new StudnetDaoImpl();
                      
       /* dao.addStudent(stu);
        
        dao.addStudent(stu2);
        
        dao.addStudent(stu3);
        
        dao.addStudent(stu4);
        
        dao.addStudent(stu5);*/
        
        //dao.deleteStudent(stu);
        
      /*  List list=dao.findAll();
        
        for (Object object : list)
		{
			Student student=(Student)object;
			
			System.out.println(student);
		}*/
        //dao.updataStudent(stu);
        
        //Student ss=dao.findByNameAndPassword("zcoug", "12wef3");
        
        //dao.deleteStudentById(6);
       dao.addStudent(student);
       
       dao.addStudent(student);
       
       dao.addStudent(student);
       
       dao.addStudent(student);
       
       
	}

}
