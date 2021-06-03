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
@Table(name = "subjects")
public class Subjects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subjectId")
	private int subjectId;
	private String title;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_fk",referencedColumnName = "subjectId")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Teacher>teacher;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_fk",referencedColumnName = "subjectId")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Marks>mark;
	
	public Subjects() {
	
	}

	public Subjects(int subjectId, String title, List<Teacher> teacher, List<Marks> mark) {
		super();
		this.subjectId = subjectId;
		this.title = title;
		this.teacher = teacher;
		this.mark = mark;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public List<Marks> getMark() {
		return mark;
	}

	public void setMark(List<Marks> mark) {
		this.mark = mark;
	}


	
	
	
	
	
	

	
}
