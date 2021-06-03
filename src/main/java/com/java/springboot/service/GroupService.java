package com.java.springboot.service;

import java.util.List;

import com.java.springboot.model.Groups;

public interface GroupService {
	
	List<Groups> getGroups();
	Groups getGroup(int id);
	Groups addGroup(Groups group);
	Groups updateGroup(int id,Groups group);
	void deleteGroup(int id);
	int getNumberOfStudentsByTeacherId(int teacherId);

}
