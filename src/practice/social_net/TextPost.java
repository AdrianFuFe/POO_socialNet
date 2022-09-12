package practice.social_net;

import java.time.LocalDate;
import java.util.List;

public class TextPost extends Post {
	protected String content;

	//CONST
	public TextPost(LocalDate postDate, List<Comment> commentList, String content) {
		super(postDate, commentList);
		this.setContent(content);
	}
	
	public TextPost(String content) {
		super();
		this.content = content;
	}

	//GET AND SET
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	//METHODS
	
	public void createTextPost( User user, String content ) {
		super.createPost(postDate, commentList);
		TextPost newTextPost = new TextPost(super.getPostDate(), super.getCommentList(), content);
		user.listPost.add(newTextPost);
		System.out.println("New text post created: " + newTextPost.content);
	}

}
