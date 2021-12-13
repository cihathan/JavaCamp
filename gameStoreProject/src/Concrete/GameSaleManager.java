package Concrete;

import Abstract.GameSaleService;
import Entities.Discount;
import Entities.Game;
import Entities.User;

public class GameSaleManager implements GameSaleService {

	@Override
	public void sell(User user, Game game, Discount discount) {
		double priceAmountAfterDiscount = game.getGamePrice()
				- (game.getGamePrice() * discount.getDiscountAmount() / 100);
		System.out.println(user.getUserFirstName() + " " + user.getUserLastName() + " adl� oyuncuya "
				+ game.getGamePrice() + " tutar�ndaki " + game.getGameName() + " adl� oyun "
				+ discount.getDiscountName() + " kampanyas� uygulanm��t�r ve %" + discount.getDiscountAmount()
				+ " indirimle " + priceAmountAfterDiscount + " tutar�na sat�lm��t�r.");
	}

}
