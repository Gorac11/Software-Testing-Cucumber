package uni.fmi.testing_ivan_final.ivanServices;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import uni.fmi.ui.models.TopicPage;


public class TopicService {

	private List<TopicPage> topics = new ArrayList<>();
	public TopicService() {
		TopicPage topic1 = new TopicPage();
		topic1.setTopicName("Hello World");
		topic1.setText("Testing");
		this.topics.add(topic1);
		TopicPage topic2 = new TopicPage();
		topic2.setTopicName("Hello World2");
		topic2.setText("Testing");
		this.topics.add(topic2);
		
	}
	public TopicPage randomTopic(int rand) {		
		return topics.get(rand);
	}
	public List<TopicPage> getTopics(){
		return topics;
	}
	
}
	
