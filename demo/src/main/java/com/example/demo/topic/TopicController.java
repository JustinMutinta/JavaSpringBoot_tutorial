package com.example.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller class. This is the driving force of the app. Everything runs through here
//@RestController allows us to make requests
@RestController
public class TopicController {
	
	//AutoWired lets us know the variable is from the Topic Service class
	@Autowired
	private TopicService topicService;
	
	//when you head to localhost:8080/topics, this will get all topics listed
	//the function is set/created in the Topic Service class and this controller uses it to output the info on a web browser or on postman
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	//similar to above BUT this one gets specific topics.
	//{id} allows the user to enter the topic they want to get.
	//@PathVariable allows the contructor to get the specific one needed
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	//Adds a new topic
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

	//Updates an existing topic
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	
	//deletes a topic
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
}
