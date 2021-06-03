package com.java.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.springboot.model.Marks;
import com.java.springboot.model.Students;

public interface StudentRepository extends JpaRepository<Students, Integer> {
	
	@Query("select m from Students s join Marks m on s.studentId = m.studentId where m.studentId =:studentId")
	List <Marks> getMarksByStudentId(int studentId);
	
}
