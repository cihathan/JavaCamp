package Abstract;

import Entities.Discount;
import Entities.Game;
import Entities.User;

public interface GameSaleService {

	void sell(User user, Game game, Discount discount);
}
