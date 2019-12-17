package pro.buildmysoftware.patterns.factory;

abstract class Drink {

	abstract protected String name();

	void drinkBy(String customer) {
		System.out.printf("customer %s drinks %s.\n", customer,
			name());
	}
}
