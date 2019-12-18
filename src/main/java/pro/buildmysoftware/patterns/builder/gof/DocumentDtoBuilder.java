package pro.buildmysoftware.patterns.builder.gof;

import java.util.ArrayList;

public class DocumentDtoBuilder implements Builder {

	private DocumentDto dto;

	public DocumentDtoBuilder() {
		dto = new DocumentDto();
		dto.setParagraphs(new ArrayList<>());
	}

	@Override
	public Builder handleHeader(String content) {
		dto.setHeader(content);
		return this;
	}

	@Override
	public Builder handleParagraph(String content) {
		dto.getParagraphs().add(content);
		return this;
	}

	@Override
	public Builder handleFooter(String content) {
		dto.setFooter(content);
		return this;
	}

	public DocumentDto getDto() {
		return dto;
	}
}
