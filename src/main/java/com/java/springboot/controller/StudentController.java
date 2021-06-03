package com.java.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.model.Marks;
import com.java.springboot.model.Students;
import com.java.springboot.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
    public List<Students> getStudents(){
        return studentService.getStudents();
    }
	
	@GetMapping("/{id}")
    public Students getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }
	
	@GetMapping("getMarkByStudentId/{id}")
    public List<Marks> getMarkByStudentId(@PathVariable int id){
        return studentService.getMarksByStudentId(id);
    }
	
	@PostMapping
    public Students addStudent(@RequestBody Students student){
        return studentService.addStudent(student);
    }
	
	@PutMapping("updateStudent/{id}")
    public Students updateStudent(@PathVariable int id,@RequestBody Students student){
        return studentService.updateStudent(id,student);
    }
	
	@DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id){
		studentService.deleteStudent(id);
    }
	

	
	

}
