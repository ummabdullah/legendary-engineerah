package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name1;
	private String description1;
	
	@ManyToOne // this isn't spring boot but JPA itself... other framework which to ORM which have JPA support.. hybernate can read this annotation and know what to do.
	private Topic topic; // Foreign Key to a primary key on the topic, this is a many to one relationship
	
	public Course() {
		
	}
	
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name1 = name;
		this.description1 = description;
		this.topic = new Topic(topicId, "","");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {	
		this.id = id;
	}
	public String getName() {
		return name1;
	}
	public void setName(String name) {
		this.name1 = name;
	}
	public String getDescription() {
		return description1;
	}
	public void setDescription(String description) {
		this.description1 = description;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
