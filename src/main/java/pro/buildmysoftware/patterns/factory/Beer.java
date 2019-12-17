package pro.buildmysoftware.patterns.factory;

class Beer extends Drink {

	@Override
	protected String name() {
		return "beer";
	}
}
