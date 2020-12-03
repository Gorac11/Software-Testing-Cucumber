package uni.fmi.ui.models;

import java.util.Date;

public class TopicPage {
	private String topicname;
	private String text;
	private String message;
	private Date datemade;
	
	public String getTopicName() {
        return topicname;
    }

    public void setTopicName(String topicname) {
    	this.topicname=topicname;
    }
    
    public String getText() {
       return text;
    }
    
    public void setText(String text) {
        this.text=text;
    }

    public Date getDate() {
        return datemade;
    }

    public void setDate(Date datemade) {
    	this.datemade=datemade;
    }
    public CommentPopup clickCommentPopup() {
    	return new CommentPopup();
    }
    
public void clickDeleteTopicButton(boolean isAdmin) {
		
		if(isAdmin==true) {
			
			message="Темата е изтрита!"; //Not actually deleted though.
		}
		else{
			message="Нямате права за триене!";
		}
		
	}
public void clickDeleteCommentButton(boolean isAdmin) {
	if(isAdmin==true) {
		
		message="Коментарът е изтрит!"; //Not actually deleted though.
	}
	else{
		message="Нямате права за триене!";
	}
}
public String getMessage() {
	return message;
}
    
}
