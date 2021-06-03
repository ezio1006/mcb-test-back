package com.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springboot.model.Subjects;

public interface SubjectRepository extends JpaRepository<Subjects, Integer> {

}
