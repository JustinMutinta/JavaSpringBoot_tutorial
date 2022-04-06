package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//Service, so the controller will be getting a lot of info/instructions from here
@Service
public class TopicService {
	
	//ArrayList with a list of Topics (From Topic class)
	//ArrayList so we can add and remove from it
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Java Framework", "Core Java Description"),
			new Topic("javascript", "Javascript Framework", "Javascript Description")
			));
	
	//function to get all Topics
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	//get one topic
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	//add one topic
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	//update existing topic
	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	//delete a topic
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		return;
	}
	
	
}
