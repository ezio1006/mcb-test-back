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

import com.java.springboot.model.Teacher;
import com.java.springboot.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping
    public List<Teacher> getTeachers(){
        return teacherService.getTeachers();
    }
	
	@GetMapping("/{id}")
    public Teacher getTeacher(@PathVariable int id){
        return teacherService.getTeacher(id);
    }
	
	@PostMapping
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);
    }
	
	@PutMapping("updateTeacher/{id}")
    public Teacher updateTeacher(@PathVariable int id,@RequestBody Teacher teacher){
        return teacherService.updateTeacher(id,teacher);
    }
	
	@DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable int id){
		teacherService.deleteTeacher(id);
    }

}
