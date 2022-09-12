package practice.social_net;

import java.time.LocalDate;
import java.util.List;

public class ImagePost extends Post {
	protected String title;
	protected int heigh;
	protected int width;
	
	//CONSTRUCTOR
	public ImagePost(String title, int heigh, int width) {
		super();
		this.title = title;
		this.heigh = heigh;
		this.width = width;
	}

	public ImagePost(LocalDate postDate, List<Comment> commentList, String title, int heigh, int width) {
		super(postDate, commentList);
		this.title = title;
		this.heigh = heigh;
		this.width = width;
	}

	//GET AND SET
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHeigh() {
		return heigh;
	}

	public void setHeigh(int heigh) {
		this.heigh = heigh;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	//METHODS
	public void createImagePost(User user, String imgName,int imgHeigh,int imgWidth) {
		super.createPost(postDate, commentList);
		ImagePost newImagePost = new ImagePost(super.getPostDate(), super.getCommentList(),imgName, imgHeigh, imgWidth);
		user.listPost.add(newImagePost);
		System.out.println("New img post created: " + " Title: " + newImagePost.title + ".jpg Size: " + newImagePost.heigh + "x" + newImagePost.width);
	}

}
