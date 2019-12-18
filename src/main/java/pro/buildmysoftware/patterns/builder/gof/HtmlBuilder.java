package pro.buildmysoftware.patterns.builder.gof;

public class HtmlBuilder implements Builder {

	private String content;

	public HtmlBuilder() {
		content = "";
	}

	@Override
	public Builder handleHeader(String content) {
		this.content += "<h1>" + content + "</h1>";
		return this;
	}

	@Override
	public Builder handleParagraph(String content) {
		this.content += "<p>" + content + "</p>";
		return this;
	}

	@Override
	public Builder handleFooter(String content) {
		this.content += "<div id='footer'>" + content + "</div>";
		return this;
	}

	public String getHtml() {
		return "<html><body>" + content + "</body></html>";
	}
}
