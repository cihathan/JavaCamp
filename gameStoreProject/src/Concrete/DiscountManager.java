package Concrete;

import Abstract.DiscountService;
import Entities.Discount;

public class DiscountManager implements DiscountService {

	@Override
	public void add(Discount discount) {
		System.out.println(discount.getDiscountName() + " Kampanya eklendi");
	}

	@Override
	public void update(Discount discount) {
		System.out.println(discount.getDiscountName() + " Kampanya güncellendi");

	}

	@Override
	public void delete(Discount discount) {
		System.out.println(discount.getDiscountName() + " Kampanya silindi");

	}

}
