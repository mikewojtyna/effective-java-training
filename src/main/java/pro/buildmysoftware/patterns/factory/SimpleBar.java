package pro.buildmysoftware.patterns.factory;

class SimpleBar implements Bar {

	@Override
	public Drink order(MenuItem type) {
		if (MenuItem.BEER.equals(type)) {
			return createBeer();
		}
		throw new IllegalArgumentException("I have beer only!");
	}

	private Drink createBeer() {
		return new Beer();
	}

}
