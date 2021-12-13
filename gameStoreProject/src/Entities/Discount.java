package Entities;

public class Discount {

	private int discountId;
	private String discountName;
	private double discountAmount;

	public Discount(int discountId, String discountName, double discountAmount) {
		this.discountId = discountId;
		this.discountName = discountName;
		this.discountAmount = discountAmount;
	}

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

}
