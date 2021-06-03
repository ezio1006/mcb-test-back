package com.java.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.springboot.model.Groups;


public interface GroupRepository extends JpaRepository<Groups, Integer> {
	
	@Query("select g from Groups g join Teacher t on g.groupId = t.groupId where t.teacherId =:teacherId")
	List<Groups> getNumberOfStudentsByTeacherId(int teacherId);
}
