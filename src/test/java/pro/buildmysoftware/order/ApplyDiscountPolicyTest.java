package pro.buildmysoftware.order;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplyDiscountPolicyTest {

	// @formatter:off
	@DisplayName(
		"given 10% discount policy and order with total 10 USD cost, " +
		"when apply discount, " +
		"then 9 USD total cost is returned"
	)
	// @formatter:on
	@Test
	void test() throws Exception {
		// given
		PurchaseOrder order = new PurchaseOrder(o -> 0.1);
		LineItem item = itemOfCostInUsd(10);
		order.addLineItem(item);

		// when
		Money totalCost = order.totalCost();

		// then
		assertThat(totalCost).isEqualTo(Money.of(CurrencyUnit.USD, 9));
	}

	private LineItem itemOfCostInUsd(double cost) {
		return new LineItem("anyProduct", Money
			.of(CurrencyUnit.USD, cost), 1);
	}
}
