package com.java.springboot.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.java.springboot.model.Groups;
import com.java.springboot.service.GroupService;

@RestController
@RequestMapping(value = "group")
@Transactional
public class GroupController {
	
	@Autowired
    private GroupService groupService;

    @GetMapping
    public List<Groups> getGroups(){
        return groupService.getGroups();
    }
    @GetMapping("/{id}")
    public Groups getGroup(@PathVariable int id){
        return groupService.getGroup(id);
    }
    
    @GetMapping("numberOfStudentsByTeacherId/{id}")
    public int getNumberOfStudentsByTeacherId(@PathVariable int id){
        return groupService.getNumberOfStudentsByTeacherId(id);
    }
    
    @PostMapping
    public Groups addGroup(@RequestBody Groups group){
        return groupService.addGroup(group);
    }
    @PutMapping("updateGroup/{id}")
    public Groups updateGroup(@PathVariable int id,@RequestBody Groups group){
        return groupService.updateGroup(id,group);
    }
    @DeleteMapping("/{id}")
    public void deleteGroup(@PathVariable int id){
    	groupService.deleteGroup(id);
    }

}
