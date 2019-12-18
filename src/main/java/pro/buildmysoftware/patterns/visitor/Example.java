package pro.buildmysoftware.patterns.visitor;

import java.util.List;

public class Example {

	public static void main(String[] args) {
		Package letter = letter("mike@wojtyna.pl");
		Package heavyPackage = heavyPackage(10.00);

		List<Package> packages = List.of(letter, heavyPackage);
		Visitor printingVisitor = new PrintingVisitor();
		packages.forEach(p -> p.accept(printingVisitor));
	}

	private static Package heavyPackage(double v) {
		return new HeavyPackage(v);
	}

	private static Package letter(String mail) {
		return new Letter(mail);
	}
}
