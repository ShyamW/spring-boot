package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/* extend crud repo with topics id'd by string id (this is why we have Topic, String as type).
 * This extension gives us common crud operations */
public interface CourseRepository extends CrudRepository<Course, String> {
	
	/* CrudRepository knows how to do this according to naming convention */
	public List<Course> findByTopicId(String topicId);
	
	
	
}
