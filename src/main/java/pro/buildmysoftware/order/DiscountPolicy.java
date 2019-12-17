package pro.buildmysoftware.order;

public interface DiscountPolicy {

	double discountFor(PurchaseOrder order);
}
