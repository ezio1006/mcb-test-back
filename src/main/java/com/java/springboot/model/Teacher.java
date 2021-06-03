package com.java.springboot.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "teacherId")
	private int teacherId;
	
	@Column(name = "subjectId")
	private int  subjectId;
	
	@Column(name = "groupId")
	private int groupId;
	
	public Teacher() {
		
	}
		
	public Teacher(int teacherId, int subjectId, int groupId) {
		super();
		this.teacherId = teacherId;
		this.subjectId = subjectId;
		this.groupId = groupId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	
	public int getSubjectId() {
		return subjectId;
	}

	public void setSubject(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

}
