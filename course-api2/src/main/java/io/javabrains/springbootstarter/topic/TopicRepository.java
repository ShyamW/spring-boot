package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

/* extend crud repo with topics id'd by string id (this is why we have Topic, String as type).
 * This extension gives us common crud operations */
public interface TopicRepository extends CrudRepository<Topic, String> {
	
	
	
	
}
