package com.java.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.springboot.exception.ResourceNotFoundException;
import com.java.springboot.model.Teacher;
import com.java.springboot.repository.TeacherRepository;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);		
	}

	@Override
	public Teacher updateTeacher(int id, Teacher teacher) {
		teacher.setTeacherId(id);
        return teacherRepository.save(teacher);
		
	}

	@Override
	public List<Teacher> getTeachers() {
		return teacherRepository.findAll();
	}

	@Override
	public Teacher getTeacher(int id) {
		 Optional<Teacher> teacher = teacherRepository.findById(id);
	        if(!teacher.isPresent())
	            throw new ResourceNotFoundException("Teacher not found!");
	        return teacher.get();
	}

	@Override
	public void deleteTeacher(int id) {
		teacherRepository.deleteById(id);
		
	}

}
