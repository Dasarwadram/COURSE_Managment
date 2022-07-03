package com.Spring.course.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="courses")
public class Course {
	
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="discrepation")
	private String discrepation;
	
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiscrepation() {
		return discrepation;
	}
	public void setDiscrepation(String discrepation) {
		this.discrepation = discrepation;
	}
	public Course(Long id, String title, String discrepation) {
		super();
		this.id = id;
		this.title = title;
		this.discrepation = discrepation;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", discrepation=" + discrepation + "]";
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

}
