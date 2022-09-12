package practice.social_net;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
	protected LocalDate postDate;
	protected List<Comment> commentList;
	
	//CONSTRUCTOR
	
	public Post() {};
	
	public Post(LocalDate postDate) {
		this.postDate = postDate;
	}
	
	public Post(LocalDate postDate, List<Comment> commentList) {
		this.postDate = postDate;
		this.commentList = commentList;
	}
	
	//GETTERS AND SETTERS	
	public LocalDate getPostDate() {
		return postDate;
	}

	public void setPostDate(LocalDate postDate) {
		postDate = LocalDate.now();
		this.postDate = postDate;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		commentList = new ArrayList<>();
		this.commentList = commentList;
	}
	
	//METHODS
	public Post createPost(LocalDate newDate, List<Comment> commentList) {
		this.setPostDate(newDate);
		this.setCommentList(commentList);
		return new Post(this.getPostDate(), this.getCommentList() ); 
	}
}
