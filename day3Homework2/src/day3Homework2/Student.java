package day3Homework2;

public class Student extends User {

	private String courseProgression;

	public Student(int userId, String userFirstName, String userLastName, String courseProgression) {
		this.setUserId(userId);
		this.setUserFirstName(userFirstName);
		this.setUserLastName(userLastName);
		this.setCourseProgression(courseProgression);
	}

	public String getCourseProgression() {
		return courseProgression;
	}

	public void setCourseProgression(String courseProgression) {
		this.courseProgression = courseProgression;
	}
}
