package pro.buildmysoftware.order;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PurchaseOrder {

	private DiscountPolicy discountPolicy;
	private Collection<LineItem> items;

	public PurchaseOrder(DiscountPolicy discountPolicy) {
		this.discountPolicy = discountPolicy;
		items = new ArrayList<>();
	}

	public Collection<LineItem> getItems() {
		return List.copyOf(items);
	}

	public Money totalCost() {
		return sum().multipliedBy(1 - discountPolicy
			.discountFor(this), RoundingMode.HALF_DOWN);
	}

	public void addLineItem(LineItem item) {
		items.add(item);
	}

	private Money sum() {
		return items.stream().map(LineItem::cost).reduce(Money::plus)
			.orElse(Money.zero(CurrencyUnit.USD));
	}
}
