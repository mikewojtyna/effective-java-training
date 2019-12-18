package pro.buildmysoftware.patterns.visitor;

public class PrintingVisitor implements Visitor {

	@Override
	public void visit(Letter letter) {
		System.out.println("I'm visiting letter from sender: " + letter
			.getSender());
	}

	@Override
	public void visit(HeavyPackage heavyPackage) {
		System.out
			.println("I'm visiting heavy package with volume: " + heavyPackage
				.getVolume());
	}
}
