package com.java.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springboot.exception.ResourceNotFoundException;
import com.java.springboot.model.Subjects;
import com.java.springboot.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
    private SubjectRepository subjectRepository;
	
	@Override
	public List<Subjects> getSubjects() {
		 return subjectRepository.findAll();
	}

	@Override
	public Subjects getSubject(int id) {
		Optional<Subjects> subject = subjectRepository.findById(id);
        if(!subject.isPresent())
                throw new ResourceNotFoundException("Subject not found!");
        return subject.get();
	}

	@Override
	public Subjects addSubject(Subjects subject) {		
		 return subjectRepository.save(subject);
	}

	@Override
	public Subjects updateSubject(int id, Subjects subject) {
		subject.setSubjectId(id);
        return subjectRepository.save(subject);
	}

	@Override
	public void deleteSubject(int id) {
		subjectRepository.deleteById(id);
		
	}

}
