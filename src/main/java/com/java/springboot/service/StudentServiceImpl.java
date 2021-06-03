package com.java.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.springboot.exception.ResourceNotFoundException;
import com.java.springboot.model.Marks;
import com.java.springboot.model.Students;
import com.java.springboot.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Students addStudent(Students student) {
		return studentRepository.save(student);
	}
	
	@Override
	public List<Students> getStudents(){
        return studentRepository.findAll();
	}
	
	@Override
	public Students getStudent(int id){
        Optional<Students> student = studentRepository.findById(id);
        if(!student.isPresent())
            throw new ResourceNotFoundException("Student not found!");
        return student.get();
	}
	
	@Override
	public Students updateStudent(int id,Students student){
		student.setStudentId(id);
        return studentRepository.save(student);
	}	
		
	@Override
	public void deleteStudent(int id){
		 studentRepository.deleteById(id);
	}

	@Override
	public List<Marks> getMarksByStudentId(int studentId) {
		System.out.println("student id = " + studentId);
		List <Marks> lstMark = studentRepository.getMarksByStudentId(studentId);
		
		return lstMark;
	}	

}
