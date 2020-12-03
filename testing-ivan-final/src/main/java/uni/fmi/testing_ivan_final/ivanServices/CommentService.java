package uni.fmi.testing_ivan_final.ivanServices;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.ivanModels.Comment;

public class CommentService {
	private List<Comment> comments = new ArrayList<>();
	
	public CommentService(){
		
	Comment comment1=new Comment();
	comment1.setText("gaga");
	comments.add(comment1);
	}
	
	public Comment randomComment(int rand) {
		return comments.get(rand);
	}
}
