package pro.buildmysoftware.patterns.builder.gof;

public interface Builder {

	Builder handleHeader(String content);

	Builder handleParagraph(String content);

	Builder handleFooter(String content);
}
