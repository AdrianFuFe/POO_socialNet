package practice.social_net;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//La lista de los usuarios que forman parte de la red social
		ArrayList<User>usersList = new ArrayList<>();
		//Usuarios
		User pepe = new User("pepe");
		User manolita = new User("manolita");
		User juan = new User("juan");
		User julia = new User("julia");
		User sandra = new User("sandra");
		User diego = new User("diego");
		User carlos = new User("carlos");
		
		//seguidores de pepe
		List<User> followedpepe = new ArrayList<>();
		followedpepe.add(manolita);
		followedpepe.add(diego);
		//seguidores de manolita
		List<User> followedmanolita = new ArrayList<>();
		followedmanolita.add(juan);
		followedmanolita.add(diego);
		
		//post de pepe
		Post imagpepe = new ImagePost(LocalDate.of(2022, 5, 4),new ArrayList<Comment>(), "Selfie.jpg", 400, 450);
		Post textpepe = new TextPost(LocalDate.of(2022, 4, 1), new ArrayList<Comment>(), "Hoy salí de acampada");
		List<Post> postlistpepe = new ArrayList<>();
		postlistpepe.add(imagpepe);
		postlistpepe.add(textpepe);
		
		//comentarios de diego y manolita en el post de pepe
		Comment commenttextpepediego = new Comment("Menuda suerte", LocalDate.of(2022, 4, 2), diego);
		Comment commenttextpepemanolita = new Comment("Espero que no lloviese", LocalDate.of(2022, 4, 2), manolita);
		List<Comment>commentlist = new ArrayList<>();
		commentlist.add(commenttextpepemanolita);
		commentlist.add(commenttextpepediego);
		//añadimos los comentarios al post de pepe
		textpepe.setCommentList(commentlist);
		//añadimos la lista de post a pepe
		pepe.setListPost(postlistpepe);
		//añadimos amigos de pepe a pepe
		pepe.setFollowedList(followedpepe);
		//añadimos amigos de manolita a manolita
		manolita.setFollowedList(followedmanolita);
		
		//añadimos los usuarios a la lista de usuarios de la red social
		usersList.add(diego);
		usersList.add(carlos);
		usersList.add(pepe);
		usersList.add(manolita);
		usersList.add(julia);
		usersList.add(sandra);
		usersList.add(juan);
		
		//en el menú se llaman a las funcionalidades descritas en el pdf
	
		
		
		//comandos para introducir un nombre
		//OPCION1 Scanner
		/*
		Scanner intro = new Scanner(System.in);
		System.out.println("Introduce un nombre");
		String user_name = intro.nextLine();
		System.out.println("Tu nombre es " + user_name);
		*/
		//OPCION2 JOptionPane
		/*
		String u_name = JOptionPane.showInputDialog("Introduce tu nombre");
		System.out.println("Tu nombre es " + u_name);
		*/
		
		
		
		User currUser;
		String errMsg = "ERROR: wrong option";
		
		String outMenu = JOptionPane.showInputDialog("Choose an option \n1: Log In \n2: Sign In");
		switch (outMenu) {
		case "1":
			String user_name_log = JOptionPane.showInputDialog("Insert your name:");
			currUser = new User(user_name_log);
			if(usersList.contains(currUser)) {
				String inMenu = JOptionPane.showInputDialog("Hi " + user_name_log + "\nChoose an option: "
						+ "\n1: Exit "
						+ "\n2: Delete"
						+ "\n3: Add Post"
						+ "\n4: Add Comment"
						+ "\n5: Show Posts"
						+ "\n6: Show Comments"
						+ "\n7: Follow user"
						+ "\n8: Unfollow user"
						);
				switch (inMenu) {
				case "1":
					System.out.println("Goodbye " + user_name_log);
				break;
				case "2":
					String deleteMenu = JOptionPane.showInputDialog("Are you sure you want to delete your user? "
							+ "\n1: Y "
							+ "\n2: N"
							);
					if (deleteMenu.equalsIgnoreCase("y")) {
						currUser.deleteUser(usersList, currUser);
						System.out.println("User " + currUser + " has been deleted");	
					}else if(deleteMenu.equalsIgnoreCase("n")) {
						System.out.println("You don't delete your user");
					}else {
						System.out.println(errMsg);						
					}
				break;
				case "3":
					
				break;
				case "4":
					
				break;
				case "5":
					
				break;
				case "6":
					
				break;
				case "7":
					
				break;
				case "8":
					
				break;
				default:
					System.out.println("ERROR: wrong option");
				break;
				}
			}else {
				System.out.println("ERROR: User " + user_name_log + " doesn't exist");
			}
		break;
		
		
		case "2":
			String new_user_name = JOptionPane.showInputDialog("Insert your name:");
			currUser = new User(new_user_name);
			if(usersList.contains(currUser)) {
				System.out.println("ERROR: User " + new_user_name + " already exists");
			}else {
				currUser.createUser(usersList, new_user_name);
				
//--------------------------------------------------------------------------------test list
				/*
				for (User user : usersList) {
					System.out.println(user.name);			
				}
				*/
				
				
					String menu = JOptionPane.showInputDialog("Welcome " + new_user_name + "\nChoose an option: "
							+ "\n1: Exit "
							+ "\n2: Delete"
							+ "\n3: Add Post"
							+ "\n4: Add Comment"
							+ "\n5: Show Posts"
							+ "\n6: Show Comments"
							+ "\n7: Follow user"
							+ "\n8: Unfollow user"
							);
					
					
					switch (menu) {
					case "1":
						System.out.println("Goodbye " + new_user_name);
					break;
					case "2":
						currUser.deleteUser(usersList, currUser);
						System.out.println("User " + new_user_name + " has been deleted");
					break;
					case "3":
						String postMenu = JOptionPane.showInputDialog("Choose your the kind of post: "
								+ "\n1: Text "
								+ "\n2: Photo"
								+ "\n3: Video"
								);
						switch (postMenu) {
						case "1":
							String content = JOptionPane.showInputDialog("Insert your text: ");
							TextPost newTextPost = new TextPost(content);
							newTextPost.createTextPost(currUser, content);
							System.out.println("MAIN TEXT POST OK");
						break;
						case "2":
							String imgName = JOptionPane.showInputDialog("Insert the image title: ");
							int imgHeigh = Integer.parseInt(JOptionPane.showInputDialog("Insert img heigh: "));
							int imgWidth = Integer.parseInt(JOptionPane.showInputDialog("Insert img width: "));
							ImagePost newImgPost = new ImagePost(imgName,imgHeigh, imgWidth);
							newImgPost.createImagePost(currUser, imgName, imgHeigh, imgWidth);
							System.out.println("MAIN IMG POST OK");
						break;
						case "3":
							String vName = JOptionPane.showInputDialog("Insert the video title: ");
							int vHeigh = Integer.parseInt(JOptionPane.showInputDialog("Insert img heigh: "));
							int vWidth = Integer.parseInt(JOptionPane.showInputDialog("Insert img width: "));
							int vDuration = Integer.parseInt(JOptionPane.showInputDialog("Insert img width: "));
							VideoPost newVideoPost = new VideoPost(vName,vHeigh, vWidth, vDuration);
							newVideoPost.createVideoPost(currUser, vName, vHeigh, vWidth, vDuration);
							System.out.println("MAIN VIDEO POST OK");
						break;
						default:
							System.out.println(errMsg);
						break;
						}
					break;
					case "4":
						System.out.println("New comment created");
					break;
					case "5":
						currUser.showListPost(currUser, currUser.getListPost());
						System.out.println("Those are your posts:");
					break;
					case "6":
						System.out.println("Those are your comments:");
					break;
					case "7":
						String userFollow = JOptionPane.showInputDialog("Insert user's name you want to follow");
						currUser.followUser(currUser, userFollow);		
					break;
					case "8":
						String userUnfollow = JOptionPane.showInputDialog("Insert user's name you want to follow");
						currUser.unfollowUser(currUser, userUnfollow);
						System.out.println("You don't follow now :");
					break;
					default:
						System.out.println(errMsg);
					break;
					}
				}
			break;
		default:
			System.out.println(errMsg);
		break;
		}

	}

}
