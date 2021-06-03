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
@Table(name = "students")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentId")
	private int studentId;
	private String firstName;
	private String lastName;
	
	@Column(name = "groupId")
	private int groupId;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "sm_fk",referencedColumnName = "studentId")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Marks> mark;
	
	public Students() {

	}

	public Students(int studentId, String firstName, String lastName, int groupId, List<Marks> mark) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.groupId = groupId;
		this.mark = mark;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public List<Marks> getMark() {
		return mark;
	}

	public void setMark(List<Marks> mark) {
		this.mark = mark;
	}
	
}
