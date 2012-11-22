package day10;



public interface IClassDao
{
	void addClass(Classes classid);
	
	Classes findById(int id);
	
	void deleteClass(Classes classid);
	
	void addCourse(Course course);
	
	void addTeacher(Teacher teacher);
	
	void registerStudentCourse(int teacherid ,int courseid);

}
