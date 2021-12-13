package gameStoreProject;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Adapters.MernisCheckService;
import Concrete.DiscountManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.UserManager;
import Entities.Discount;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		User user1 = new User(1, "12345678911", "Cihat Han", "Toparlak", 1998);

		Game game1 = new Game(1, "Battlefield 2042", 450);

		Discount discount1 = new Discount(1, "Steam yýlbaþý indirimleri", 10);

		UserManager userManager = new UserManager(new MernisCheckService());
		userManager.add(user1);

		GameManager gameManager = new GameManager();
		gameManager.add(game1);

		DiscountManager discountManager = new DiscountManager();
		discountManager.add(discount1);

		UserCheckService userCheckService = new MernisCheckService();

		GameSaleManager gameSaleManager = new GameSaleManager();
		if (userCheckService.checkIfRealUser(user1) == true) {
			gameSaleManager.sell(user1, game1, discount1);
		} else {
			System.out.println("Kullanýcý kimliði doðrulanamadýðý için alýþveriþ gerçekleþtirilemedi");
		}

	}

}
