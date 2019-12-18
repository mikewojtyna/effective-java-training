package pro.buildmysoftware.patterns.builder.gof;

import lombok.Data;

import java.util.List;

@Data
public class DocumentDto {

	private String header;
	private List<String> paragraphs;
	private String footer;
}
