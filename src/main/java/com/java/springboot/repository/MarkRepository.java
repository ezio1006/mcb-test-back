package com.java.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.springboot.model.Marks;


public interface MarkRepository extends JpaRepository<Marks, Integer> {

	@Query("select m.mark from Marks m where m.studentId = :studentId ")
	Integer getMarkByStudentId(int studentId);
	
	
	
}
