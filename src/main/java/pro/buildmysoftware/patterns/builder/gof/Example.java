package pro.buildmysoftware.patterns.builder.gof;

import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		DocumentDtoBuilder dtoBuilder = new DocumentDtoBuilder();
		HtmlBuilder htmlBuilder = new HtmlBuilder();

		DocumentFileParser parser = new DocumentFileParser(dtoBuilder,
			htmlBuilder);
		InputStream resourceAsStream = Example.class
			.getResourceAsStream("/files/document.txt");
		parser.parse(resourceAsStream);

		System.out.println("DTO result: " + dtoBuilder.getDto());
		System.out.println("HTML result: " + htmlBuilder.getHtml());
	}
}
