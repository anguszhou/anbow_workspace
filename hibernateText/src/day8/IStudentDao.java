package day8;

import java.util.List;

public interface IStudentDao
{
    void addStudent(Student student);
    
    void deleteStudent(Student student );
    
    void deleteStudentById(int id);
    
    List findAll();
    
    Student findByNameAndPassword(String name , String password);
    
    Student findById(int id);
	
    void updataStudent(Student student);
}
