package com.springrest.nosoft.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.nosoft.springrest.entites.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<Course>();
		list.add(new Course(125,"java","Basic project"));
		list.add(new Course(126,"Spring Boot","Scratch project concept"));

		
	}
	
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	public Course getCourse(long courseId) {


		Course c=null;
		for(Course crs:list) {
			if(crs.getId()==courseId) {
				c=crs;
				break;
			}
		}
		return c;
	}

	
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	

}

