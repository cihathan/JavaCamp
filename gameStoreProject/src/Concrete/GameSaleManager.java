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
		System.out.println(user.getUserFirstName() + " " + user.getUserLastName() + " adlý oyuncuya "
				+ game.getGamePrice() + " tutarýndaki " + game.getGameName() + " adlý oyun "
				+ discount.getDiscountName() + " kampanyasý uygulanmýþtýr ve %" + discount.getDiscountAmount()
				+ " indirimle " + priceAmountAfterDiscount + " tutarýna satýlmýþtýr.");
	}

}
