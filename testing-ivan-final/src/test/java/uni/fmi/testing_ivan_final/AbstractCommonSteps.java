package uni.fmi.testing_ivan_final;

import java.util.concurrent.ThreadLocalRandom;

import uni.fmi.ui.models.ForumHomePage;
import uni.fmi.ui.models.TopicPage;
import uni.fmi.testing_ivan_final.ivanServices.TopicService;
public class AbstractCommonSteps {
	TopicService topicservice=new TopicService();
	TopicPage topic;
	int rand = ThreadLocalRandom.current().nextInt(0, topicservice.getTopics().size()); //Always get the same random
	//Currently creatres a random between [0,size=2), so either 0 or 1

	
	public TopicPage gettopic() {
	return topic=topicservice.randomTopic(rand);
	}
	
}
