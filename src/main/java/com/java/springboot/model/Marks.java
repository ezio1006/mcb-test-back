package com.java.springboot.model;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marks")
public class Marks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "markId")
	private int markId;
	private Date date;
	private int mark;

	@Column(name = "studentId")
	private int studentId;
	
	@Column(name = "subjectId")
	private int subjectId;

	public Marks() {
		
	}

	public Marks(int markId, Date date, int mark, int studentId, int subjectId) {
		super();
		this.markId = markId;
		this.date = date;
		this.mark = mark;
		this.studentId = studentId;
		this.subjectId = subjectId;
	}

	public int getMarkId() {
		return markId;
	}

	public void setMarkId(int markId) {
		this.markId = markId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public int getSubjectId() {
		return subjectId;
	}


	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

}
