package io.javabrains.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String name1;
	private String description1;

	public Topic() {
		
	}
	
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name1 = name;
		this.description1 = description;
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
	private String name;
	private String description;
	

}
