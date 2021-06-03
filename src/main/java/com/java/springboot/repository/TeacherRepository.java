package com.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springboot.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
