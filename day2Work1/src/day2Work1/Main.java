package day2Work1;

public class Main {

	public static void main(String[] args) {
		
		Camp camp1 = new Camp(1, "JAVA + REACT","JAVA + REACT eðitimi");

		Camp camp2 = new Camp();
		camp2.id = 2;
		camp2.name = "C# + ANGULAR";
		camp2.details = "C# + ANGULAR eðitimi";

		Camp camp3 = new Camp();
		camp3.id = 2;
		camp3.name = "JavaScript";
		camp3.details = "JavaScript eðitimi";


		Camp[] camps = { camp1, camp2, camp3 };

		for (Camp camp : camps) {
			System.out.println("Kurs: " + camp.name);
		}


		CampManager campManager = new CampManager();
		campManager.addToWishList(camp2);
		campManager.addToWishList(camp3);
		campManager.startTheCourse(camp1);

	}

}
