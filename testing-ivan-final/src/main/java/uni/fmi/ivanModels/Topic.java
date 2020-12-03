package uni.fmi.ivanModels;

import java.util.*;


/**
 * 
 */
public class Topic {

    /**
     * Default constructor
     */
    public Topic() {
    }

   
    private String topicname;
    private String text;
    private Date datemade;
    public Set<Topic> children;
    public Topic parent;

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

}