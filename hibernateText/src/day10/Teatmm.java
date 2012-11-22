package day10;

public class Teatmm
{
public static void main(String[] args)
{
	IClassDao dao = new ClassDaoImpl();
	
	/*Teacher teacher1 = new Teacher ();
	
	teacher1.setName("zhoucoong");
	
    Teacher teacher2 = new Teacher ();
	
	teacher2.setName("wangp");
	
	Course course1 = new Course();
	
	course1.setName("corejava");
	
	Course course2 = new Course();
			
	course2.setName("oracle");
			
	Course course3 = new Course();
			
	course3.setName("spring");
			
	Course course4 = new Course();
			
	course4.setName("ooad");
	
	dao.addCourse(course1);
	
	dao.addCourse(course2);
	
	dao.addCourse(course3);
	
	dao.addCourse(course4);
	
	dao.addTeacher(teacher1);
	
	dao.addTeacher(teacher2);*/
	
	/*dao.registerStudentCourse(1,2 );
	
	dao.registerStudentCourse(1,4 );
	
	dao.registerStudentCourse(2, 2);
	
	dao.registerStudentCourse(2, 4);*/
	
	dao.registerStudentCourse(2, 3);
}
}
