package pro.buildmysoftware.patterns.factory;

public class MenuItemAlcoholExample {

	public static void main(String[] args) {
		MenuItem beer = MenuItem.BEER;
		System.out.println(beer.getAlcohol());
	}
}
