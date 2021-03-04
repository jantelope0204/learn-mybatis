package com.mapper.student;

import com.pojo.Student;
import com.pojo.Teacher;

import java.util.List;

public interface StudentMapper {
    public List<Student> getStudent();
    public Teacher getTeacher(String id);
    public List<Student> getStudent2();

}
