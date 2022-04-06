package com.example.demo.topic;

//This is the model used for what data the spring boot app will use
public class Topic {
	
	//set up the variable
	private String id;
	private String name;
	private String description;
	
	//constructor
	public Topic() {
		
	}
	
	//constructor for new object
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	//getters and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
