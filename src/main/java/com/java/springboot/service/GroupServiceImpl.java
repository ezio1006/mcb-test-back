package com.java.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springboot.exception.ResourceNotFoundException;
import com.java.springboot.model.Groups;
import com.java.springboot.repository.GroupRepository;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
    private GroupRepository groupRepository;

	@Override
    public List<Groups> getGroups(){
        return groupRepository.findAll(); 
    }
    
    @Override
    public Groups getGroup(int id){
        Optional<Groups> group = groupRepository.findById(id);
        if(!group.isPresent())
                throw new ResourceNotFoundException("Group not found!");
        return group.get();
    }
    
    @Override
    public Groups addGroup(Groups group){
        return groupRepository.save(group);
    }
    
    @Override
    public Groups updateGroup(int id,Groups group){
    	group.setGroupId(id);
        return groupRepository.save(group);
    }
    
    @Override
    public void deleteGroup(int id){
    	groupRepository.deleteById(id);
    }
    
    @Override
    public int getNumberOfStudentsByTeacherId(int teacherId){
    	
    	System.out.println("group id = "  );
    	List<Groups> listGroup = groupRepository.getNumberOfStudentsByTeacherId(teacherId);
    	int numberOfStudents =0;
    	for(int i =0;i<listGroup.size();i++) {
    		numberOfStudents = listGroup.get(i).getStudents().size();
    	}    	
    	return numberOfStudents;
    }
}
