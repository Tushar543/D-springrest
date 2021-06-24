package com.springrest.nosoft.springrest.services;

import java.util.List;

import com.springrest.nosoft.springrest.entites.Course;

public interface CourseService {

	public List<Course> getCourses();//makes easy for loose coupling

	public Course getCourse(long courseId);

	public Course addCourse(Course course);
	
}
