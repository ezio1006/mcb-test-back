package com.java.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springboot.exception.ResourceNotFoundException;
import com.java.springboot.model.Marks;
import com.java.springboot.repository.MarkRepository;

@Service
public class MarkServiceImpl implements MarkService {

	@Autowired
    private MarkRepository markRepository;
	
	@Override
	public Marks addMark(Marks mark) {
		 return markRepository.save(mark);
	}

	@Override
	public Marks updateMark(int id, Marks mark) {
		mark.setMark(id);
        return markRepository.save(mark);
	}

	@Override
	public List<Marks> getMarks() {
		return markRepository.findAll();
	}

	@Override
	public Marks getMark(int id) {
		Optional<Marks> mark = markRepository.findById(id);
        if(!mark.isPresent())
                throw new ResourceNotFoundException("Mark not found!");
        return mark.get();
	}

	@Override
	public void deleteMark(int id) {
		markRepository.deleteById(id);
		
	}
	
	@Override
	public int getMarkByStudentId(int studentId) {
		System.out.println("student id = " + studentId);
		int mark = markRepository.getMarkByStudentId(studentId);
        System.out.println("mark = " + mark);
        return mark;
	}
	
	

}
