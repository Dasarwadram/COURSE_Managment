package com.Spring.course.service;

import java.util.List;

import com.Spring.course.Entity.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(Long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(Long courseId);
	
}
