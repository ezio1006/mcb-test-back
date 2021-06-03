package com.java.springboot.service;

import java.util.List;

import com.java.springboot.model.Teacher;



public interface TeacherService {

	Teacher addTeacher(Teacher teacher);
	Teacher updateTeacher(int id,Teacher teacher);
	List<Teacher> getTeachers();
	Teacher getTeacher(int id);
	void deleteTeacher(int id);
}
