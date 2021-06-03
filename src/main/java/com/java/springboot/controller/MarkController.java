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

import com.java.springboot.model.Marks;
import com.java.springboot.service.MarkService;


@RestController
@RequestMapping("/mark")
public class MarkController {
	
	@Autowired
	private MarkService markService;
	
	@GetMapping
    public List<Marks> getMarks(){
        return markService.getMarks();
    }
	
	@GetMapping("/{id}")
    public Marks getMark(@PathVariable int id){
        return markService.getMark(id);
    }
	
	@GetMapping("markByStudentId/{id}")
    public int getMarkByStudentId(@PathVariable int id){
        return markService.getMarkByStudentId(id);
    }
	
	@PostMapping
    public Marks addMark(@RequestBody Marks mark){
        return markService.addMark(mark);
    }
	
	@PutMapping("updateMark/{id}")
    public Marks updateMark(@PathVariable int id,@RequestBody Marks mark){
        return markService.updateMark(id,mark);
    }
	
	@DeleteMapping("/{id}")
    public void deleteMark(@PathVariable int id){
		markService.deleteMark(id);
    }

}
