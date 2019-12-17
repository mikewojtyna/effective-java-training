package pro.buildmysoftware.order;

import org.joda.money.Money;

import java.math.RoundingMode;

public class LineItem {

	private String product;
	private Money unitPrice;
	private int quantity;

	public LineItem(String product, Money unitPrice, int quantity) {
		this.product = product;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public boolean hasTheSameName(String name) {
		return product.equals(name);
	}

	public Money cost() {
		return unitPrice.multipliedBy(quantity,
			RoundingMode.HALF_DOWN);
	}
}
