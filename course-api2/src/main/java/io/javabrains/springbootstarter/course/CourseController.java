package io.javabrains.springbootstarter.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.Topic;

/* Mark Rest Controller */
@RestController
public class CourseController {
	
	/* Marks as needing dependency injection */
	@Autowired
	private CourseService courseService;
	
	/* When /Courses/{id}/courses is requested: the courseService is ran */
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(String id) {
		return courseService.getAllCourses(id);
	}
	
	/* matches /Courses/<anything> with getCourse method */
	/* can also do @PathVariable("id") String id*/
	@RequestMapping("/topics/{topicId}/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) { 
		return courseService.getCourse(courseId);
	}
	
	/* bind post to Courses (make a new Course) */
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
	/* picks course instance from json request and take topicId from url */
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) { 
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}
	
	/* bind put req (update Course) */
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{courseId}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String courseId) { /* picks instance from json request*/
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}
	
	/* bind delete course */
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId) { /* picks instance from json request*/
		courseService.deleteCourse(courseId);
	}
	
}