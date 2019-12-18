package pro.buildmysoftware.patterns.visitor;

public interface Visitor {

	void visit(Letter letter);

	void visit(HeavyPackage heavyPackage);
}
