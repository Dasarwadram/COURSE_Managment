package com.Spring.course.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Spring.course.Entity.Course;

public interface CourseDao extends JpaRepository<Course,Long>{

}
