package pro.buildmysoftware.patterns.visitor;

public class HeavyPackage extends Package {

	private double volume;

	public HeavyPackage(double volume) {
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
