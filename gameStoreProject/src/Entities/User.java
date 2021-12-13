package Entities;

public class User {

	private int userId;
	private String nationalityID;
	private String userFirstName;
	private String userLastName;
	private int birthYear;

	public User(int userId, String nationalityID, String userFirstName, String userLastName, int birthYear) {
		this.userId = userId;
		this.nationalityID = nationalityID;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.birthYear = birthYear;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNationalityID() {
		return nationalityID;
	}

	public void setNationalityID(String nationalityID) {
		this.nationalityID = nationalityID;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
