package day3Homework2;

public class Instructor extends User {

	private String continuingCourse;

	public Instructor(int userId, String userFirstName, String userLastName, String continuingCourse) {
		this.setUserId(userId);
		this.setUserFirstName(userFirstName);
		this.setUserLastName(userLastName);
		this.setContinuingCourse(continuingCourse);
	}

	public String getContinuingCourse() {
		return continuingCourse;
	}

	public void setContinuingCourse(String continuingCourse) {
		this.continuingCourse = continuingCourse;
	}

}
