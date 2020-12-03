package uni.fmi.testing_ivan_final;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.ui.models.CommentPopup;
import uni.fmi.ui.models.ForumHomePage;
import uni.fmi.ui.models.TopicPage;
//import uni.fmi.ivanModels.Topic;
import uni.fmi.testing_ivan_final.ivanServices.TopicService;
import uni.fmi.testing_ivan_final.ivanServices.UserService;

public class CommentSteps extends AbstractCommonSteps{
	TopicPage topic=gettopic();
	CommentPopup comment;
	

	@Given("^натисне бутон за писане на коментар$")
	public void натисне_бутон_за_писане_на_коментар() throws Throwable {
		comment=topic.clickCommentPopup();
	}

	@Given("^визуализира се попъп за писане на коментар$")
	public void визуализира_се_попъп_за_писане_на_коментар() throws Throwable {
	    assertNotNull(comment);
	}

	@When("^въведе валидно съобщение$")
	public void въведе_валидно_съобщение() throws Throwable {
	   comment.addText("Hallelujah!");
	}

	@When("^натисне бутона за постване$")
	public void натисне_бутона_за_постване() throws Throwable {
	   comment.clickPostButton();
	}
	
	@Then("^Потребител вижда съобщение \"([^\"]*)\"$")
	public void потребител_вижда_съобщение(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, comment.getMessage());
	}
	
	@When("^въведе празно съобщение$")
	public void въведе_празно_съобщение() throws Throwable {
	    //comment.addText(""); 		//Delete this step completely?
	}

	@When("^въведе прекалено дългъг коментар$")
	public void въведе_прекалено_дългъг_коментар() throws Throwable {
		comment.tooLong();
									//Second way?
		
		  /*comment.addText(
				"I'm blue da ba dee da ba daa\r\n" + 
				"Da ba dee da ba daa, da ba dee da ba daa, da ba dee da ba daa\r\n" + 
				"Da ba dee da ba daa, da ba dee da ba daa, da ba dee da ba daa\r\n" + 
				"\r\n" + 
				"I'm blue da ba dee da ba daa\r\n" + 
				"Da ba dee da ba daa, da ba dee da ba daa, da ba dee da ba daa\r\n" + 
				"Da ba dee da ba daa, da ba dee da ba daa, da ba dee da ba daa\r\n" + 
				"\r\n" + 
				"I have a blue house with a blue window\r\n" + 
				"Blue is the color of all that I wear\r\n" + 
				"Blue are the streets and all the trees are too\r\n" + 
				"I have a girlfriend and she is so blue\r\n" + 
				"Blue are the people here that walk around\r\n" + 
				"Blue like my Corvette, it's in and outside\r\n" + 
				"Blue are the words I say and what I think\r\n" + 
				"Blue are the feelings that live inside me\r\n" + 
				"\r\n" + 
				"I'm blue da ba dee da ba daa\r\n" + 
				"Da ba dee da ba daa, da ba dee da ba daa, da ba dee da ba daa\r\n" + 
				"Da ba dee da ba daa, da ba dee da ba daa, da ba dee da ba daa\r\n" + 
				"\r\n" + 
				"I'm blue da ba dee da ba daa\r\n" + 
				"Da ba dee da ba daa, da ba dee da ba daa, da ba dee da ba daa\r\n" + 
				"Da ba dee da ba daa, da ba dee da ba daa, da ba dee da ba daa\r\n" + 
				"\r\n"
				);
				*/
	}

}
