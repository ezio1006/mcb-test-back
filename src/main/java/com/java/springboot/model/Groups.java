package com.java.springboot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "groups")
public class Groups {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "groupId")
	private int groupId;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "gs_fk",referencedColumnName = "groupId")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Students> students;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "gt_fk",referencedColumnName = "groupId")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Teacher> teacher;
	
	public Groups() {
		
	}
	
	public Groups(int groupId, String name, List<Students> students, List<Teacher> teacher) {
		super();
		this.groupId = groupId;
		this.name = name;
		this.students = students;
		this.teacher = teacher;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
	

}
