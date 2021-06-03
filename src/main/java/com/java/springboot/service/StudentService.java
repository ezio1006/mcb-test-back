package com.java.springboot.service;

import java.util.List;

import com.java.springboot.model.Marks;
import com.java.springboot.model.Students;



public interface StudentService {
	
	Students addStudent(Students student);
	Students updateStudent(int id,Students student);
	List<Students> getStudents();
	Students getStudent(int id);
	void deleteStudent(int id);
	List<Marks> getMarksByStudentId(int studentId);

}
