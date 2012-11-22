create table ambow_student(
id number primary key,
name varchar2(20)
);
create table ambow_course(
id number primary key,
cname varchar2(20)
);

create table ambow_student_course(
studentid number,
courseid number,
primary key(studentid,courseid)
);
alter table ambow_student_course add constraints ambow_student_course
foreign key(studentid) references ambow_student(id);

alter table ambow_student_course add constraints ambow_students_courses
foreign key(courseid) references ambow_course(id);
