package io.javabrains.springbootstarter.topic;

import java.util.List;

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
		return new ResponseEntity<>(topicService.getAllTopics(), HttpStatus.FOUND);
	}
	
	@RequestMapping("/topics/{foo}")
	public ResponseEntity<Topic> getTopic (@PathVariable("foo") String id) {
		//return topicService.getTopic(id);
		return new ResponseEntity<>(topicService.getTopic(id), HttpStatus.FOUND);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topics")
	public ResponseEntity addTopic(@RequestBody Topic topic) {
		try {	
			topicService.addTopic(topic);
			return new ResponseEntity(HttpStatus.CREATED);
		}
		catch (Exception e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/topics/{foo}")
	public ResponseEntity updateTopic(@RequestBody Topic topic, @PathVariable("foo") String id) {
		
		try {	
			topicService.updateTopic(id, topic);
			return new ResponseEntity(HttpStatus.FOUND);
		}
		catch (Exception e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/topics/{foo}")
	public ResponseEntity deleteTopic(@PathVariable("foo") String id) {
		try {	
			topicService.deleteTopic(id);
			return new ResponseEntity(HttpStatus.GONE);
		}
		catch (Exception e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		
		
	}
}
