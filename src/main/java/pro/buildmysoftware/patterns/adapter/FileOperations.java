package pro.buildmysoftware.patterns.adapter;

import java.nio.file.Path;

public interface FileOperations {

	void createFile(Path path);

	void deleteFile(Path path);
}
