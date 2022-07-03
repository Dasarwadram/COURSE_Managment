package com.Spring.course.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.course.Dao.CourseDao;
import com.Spring.course.Entity.Course;
import com.Spring.course.service.CourseService;
@Service
public class CourseServiceimpl implements CourseService {

  @Autowired
	public CourseDao courseDao;
	
	List<Course>list;
	public CourseServiceimpl() {
		list=new ArrayList<>();
        list.add(new Course( 14523L,"java core","java is a very good language"));
        list.add(new Course( 1432L,"Spring","Creating Rest api using Spring Boot"));

	}
	

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}


	@Override
	public Course getCourse(Long courseId) {
		/*
		 * Course c=null; for (Course course:list) { if(course.getId()==courseId) {
		 * c=course; break; } } return c;
		 */
		return courseDao.getReferenceById(courseId);	
		
	}


	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		/*
		 * list.forEach(e -> { if (e.getId() == course.getId()) {
		 * e.setTitle(course.getTitle()); e.setDiscrepation(course.getDiscrepation()); }
		 * });
		 */
		courseDao.save(course);
		return course;
	}


	@Override
	public void deleteCourse(Long courseId) {
		
		/*
		 * list=this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.
		 * toList());
		 */

		Course entity= courseDao.getReferenceById(courseId);
		courseDao.delete(entity);
	}
	

}
