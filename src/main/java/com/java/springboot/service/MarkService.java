package com.java.springboot.service;

import java.util.List;

import com.java.springboot.model.Marks;


public interface MarkService {

	Marks addMark(Marks mark);
	Marks updateMark(int id,Marks mark);
	List<Marks> getMarks();
	Marks getMark(int id);
	void deleteMark(int id);
	int getMarkByStudentId(int studentId);
}
