package day3Homework2;

public class StudentManager extends UserManager {

	public void courseRegistration(User user) {
		System.out.println(user.getUserFirstName() + " " + user.getUserLastName() + " Kursa kayýt oldu");
	}

}
