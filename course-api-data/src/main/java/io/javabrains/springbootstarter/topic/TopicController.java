package io.javabrains.springbootstarter.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topics")
	public ResponseEntity<List<Topic>> getAllTopics () {
		//return topicService.getAllTopics();
		return new ResponseEntity<>(topicService.getAllTopics(), HttpStatus.OK);
	}
	
	@RequestMapping("/topics/{foo}")
	public Optional<Topic> getTopic (@PathVariable("foo") String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		
	}
	@RequestMapping(method = RequestMethod.PUT, value="/topics/{foo}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable("foo") String id) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/topics/{foo}")
	public void deleteTopic(@PathVariable("foo") String id) {
		topicService.deleteTopic(id);
		
		
	}
}
