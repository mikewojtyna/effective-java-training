package pro.buildmysoftware.patterns.visitor;

public class Letter extends Package {

	private String sender;

	public Letter(String sender) {
		this.sender = sender;
	}

	public String getSender() {
		return sender;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
