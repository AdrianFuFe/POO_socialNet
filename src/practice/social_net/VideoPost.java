package practice.social_net;

import java.time.LocalDate;
import java.util.List;

public class VideoPost extends Post {
	protected String title;
	protected int heigh;
	protected int width;
	protected int duration;

	//CONSTRUCTOR
	public VideoPost(String title, int heigh, int width, int duration) {
		super();
		this.title = title;
		this.heigh = heigh;
		this.width = width;
		this.duration = duration;
	}

	public VideoPost(LocalDate postDate, List<Comment> coments, String title, int heigh, int width, int duration) {
		super(postDate, coments);
		this.title = title;
		this.heigh = heigh;
		this.width = width;
		this.duration = duration;
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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	//METHODS
	public void createVideoPost(User user, String title, int heigh, int width, int duration) {		
		VideoPost newVideoPost = new VideoPost(super.getPostDate(), super.getCommentList(), title, heigh, width, duration);
		user.listPost.add(newVideoPost);
		System.out.println("New video post created: " 
				+ " Title: " + newVideoPost.title + ".mp4" 
				+ " Size: " + newVideoPost.heigh + "x" + newVideoPost.width
				+ " Duration: " + newVideoPost.duration + "min"
				);
	}

}
