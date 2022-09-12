package practice.social_net;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
	
	protected String name;
	protected List<User> followedList;
	protected List<Post> listPost;
	
	//CONSTRUCTORS
	public User (String name) {
		this.name = name;
		this.followedList = new ArrayList<>();
		this.listPost = new ArrayList<>();

	}

	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getFollowedList() {
		return followedList;
	}

	public void setFollowedList(List<User> followedList) {
		this.followedList = followedList;
	}

	public List<Post> getListPost() {
		return listPost;
	}

	public void setListPost(List<Post> listPost) {
		this.listPost = listPost;
	}
	
	
	//METHODS
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}
	
	
	public void createUser(List<User> usersList, String name) {
		User user = new User(name);
		user.setName(name);
		user.setFollowedList(new ArrayList<>());
		user.setListPost(new ArrayList<>());
		usersList.add(user);
	}
	
	public void deleteUser(List<User> usersList, User user) {
		usersList.remove(user);
	}

	public void followUser(User currUser, String userFollow) {		
		boolean isFollowed = true;
		for (User u : currUser.getFollowedList()) {
			if(u.getName().equals(userFollow)) {
				isFollowed = false;
			}
		}
		if (isFollowed == false) {			
//			currUser.followedList.add());					
			isFollowed = true;
			System.out.println("You are following " + userFollow + " now");
		}
	}	
	
	public void unfollowUser(User currUser, String userUnfollow) {	
		boolean isFollowed = false;
		for (User u : currUser.getFollowedList()) {
			if(u.getName().equals(userUnfollow)) {
				isFollowed = true;
			}
		}	
		if ( isFollowed == true) {
//			currUser.followedList.remove(userUnfollow);	
			isFollowed = false;
			System.out.println("You have just reomved " + userUnfollow + " from your following list");
		}
	}	
	
	
	public String showListPost(User user, List<Post> listPost) {
		StringBuilder bld = new StringBuilder();
		for (Post p : listPost) {
			bld.append(p.toString());
		}
		return bld.toString();
	}
	
	
	
}