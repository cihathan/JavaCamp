package day3Homework2;

public class UserManager {

	public void addUser(User user) {
		System.out.println(user.getUserFirstName() + " " + user.getUserLastName() + " Adl� kullan�c� eklendi");
	}

	public void updateUser(User user) {
		System.out.println(user.getUserFirstName() + " " + user.getUserLastName() + " Adl� kullan�c� g�ncellendi");
	}

}
