package com.Spring.course.cantroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.course.Entity.Course;
import com.Spring.course.service.CourseService;

 

@RestController
public class MyController {
	
	@Autowired
	public CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "WELCOME This is Home Page";
	
	}
	
@GetMapping("/courses")
public List<Course>getCourses()
{
	return this.courseService.getCourses();
}

@GetMapping("/courses/{courseId}")
public Course getCourse(@PathVariable String courseId) {
	return this.courseService.getCourse(Long.parseLong(courseId));
}


@PostMapping("/courses")
public Course addCourse(@RequestBody Course course) {
	return this.courseService.addCourse(course);
	
}

@PutMapping("/courses")
public Course updatCourse(@RequestBody Course course) {
	return this.courseService.updateCourse(course);
}


@DeleteMapping("/courses/{courseId}")
public ResponseEntity<HttpStatus>  deleteCourse(@PathVariable Long courseId)
{
	try {
		this.courseService.deleteCourse(courseId);
		return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
		
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
 
 
 
}
}
	

  