package day3Homework2;

public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "Java & React");

		Student student = new Student(2, "Cihat Han", "Toparlak", "%22 Tamamlandı");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor);
		instructorManager.updateUser(instructor);
		instructorManager.addCourse(instructor);
		instructorManager.updateCourse(instructor);

		StudentManager studentManager = new StudentManager();
		studentManager.addUser(student);
		studentManager.updateUser(student);
		studentManager.courseRegistration(student);

	}

}
