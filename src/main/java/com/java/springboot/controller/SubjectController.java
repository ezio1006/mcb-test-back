package com.java.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.model.Subjects;
import com.java.springboot.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subjects> getSubjects(){
        return subjectService.getSubjects();
    }
    @GetMapping("/{id}")
    public Subjects getSubject(@PathVariable int id){
        return subjectService.getSubject(id);
    }
    @PostMapping
    public Subjects addSubject(@RequestBody Subjects subject){
    	System.out.println(subject.getSubjectId());
    	System.out.println(subject.getTitle());
    	System.out.println(subject.getMark());
        return subjectService.addSubject(subject);
    }
    @PutMapping("updateSubject/{id}")
    public Subjects updateSubject(@PathVariable int id,@RequestBody Subjects subject){
        return subjectService.updateSubject(id,subject);
    }
    @DeleteMapping("/{id}")
    public void deleteSubject(@PathVariable int id){
    	subjectService.deleteSubject(id);
    }
}
