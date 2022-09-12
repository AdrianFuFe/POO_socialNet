package practice.social_net;

import java.time.LocalDate;

public class Comment {
	protected String content;
	protected LocalDate commentDate;
	protected String user;
	
	//CONSTRUCTOR
	public Comment(String content, LocalDate commentDate, User user) {
		this.content = content;
		this.commentDate = commentDate;
		this.user = user.name;
	}

	//GETTERS AND SETTERS
	public LocalDate getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(LocalDate commentDate) {
		this.commentDate = commentDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	//METHODS
}
