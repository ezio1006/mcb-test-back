package com.java.springboot.service;

import java.util.List;

import com.java.springboot.model.Subjects;

public interface SubjectService {

	List<Subjects> getSubjects();
	Subjects getSubject(int id);
	Subjects addSubject(Subjects subject);
	Subjects updateSubject(int id,Subjects subject);
	void deleteSubject(int id);
}
