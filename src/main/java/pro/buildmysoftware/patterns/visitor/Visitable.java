package pro.buildmysoftware.patterns.visitor;

public interface Visitable {

	void accept(Visitor visitor);
}
