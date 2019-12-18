package pro.buildmysoftware.patterns.visitor;

public abstract class Package implements Visitable {

	private String name;
	private double weight;

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}
}
