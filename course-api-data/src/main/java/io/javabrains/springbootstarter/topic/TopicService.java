package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository; 

	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Srping Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "JavaScript ", "JavaScript Description")
			));
	
	public List<Topic> getAllTopics(){
		
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
		
	}
	
	public Optional<Topic> getTopic(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}
	
}
