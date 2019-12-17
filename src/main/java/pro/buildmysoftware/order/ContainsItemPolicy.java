package pro.buildmysoftware.order;

public class ContainsItemPolicy implements DiscountPolicy {

	private String productName;

	public ContainsItemPolicy(String productName) {
		this.productName = productName;
	}

	@Override
	public double discountFor(PurchaseOrder order) {
		return order.getItems().stream()
			.filter(item -> item.hasTheSameName(productName))
			.findAny().map(b -> 0.2).orElse(0.1);
	}
}
