package uni.fmi.testing_ivan_final;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uni.fmi.ui.models.CommentPopup;
import uni.fmi.ui.models.ForumHomePage;
import uni.fmi.ui.models.TopicPage;
import uni.fmi.testing_ivan_final.ivanServices.TopicService;
import uni.fmi.testing_ivan_final.ivanServices.UserService;

public class CommonSteps extends AbstractCommonSteps {
	
	TopicPage topic;
	CommentPopup comment;
	boolean isRegistered;
	boolean isLoggedIn;
	UserService userservice=new UserService();
	ForumHomePage homepage;
	
	@Given("^Потребител отваря форум страницата$")
	public void потребител_отваря_форум_страницата() throws Throwable {
	   homepage = new ForumHomePage();
	}

	@Given("^се е регистрирал в системата$")
	public void се_е_регистрирал_в_системата() throws Throwable {
	   userservice.isRegistered=true; 
	}

	@Given("^се е логнал в системата$")
	public void се_е_логнал_в_системата() throws Throwable {
	   userservice.isLoggedIn=true;
	}

	@Given("^натисне на съществуваща тема на сайта$")
	public void натисне_на_съществуваща_тема_на_сайта() throws Throwable {
		topic=gettopic();
		}

	@Given("^визуализира се страница за темата$")
	public void визуализира_се_страница_за_темата() throws Throwable {
	   assertNotNull(topic);
	}
	/*
	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void вижда_съобщение(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, comment.getMessage());
	}*/
}
