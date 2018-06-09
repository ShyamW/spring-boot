package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* Business services are singletons. When application starts, detect all services */
@Service
public class CourseService {
	
	@Autowired /* Gets instance into spring service class */
	private CourseRepository courseRepository;

	
	/* Gets all Topics */
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		// gets stream of all, adds to courses
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	/* Gets the topic by id */
	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}
	
	/* adds course using save command  */
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	/* if row exists, topicRepository will update tuple */
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
		
	}
}