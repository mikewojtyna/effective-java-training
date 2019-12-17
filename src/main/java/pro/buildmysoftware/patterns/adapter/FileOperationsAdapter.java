package pro.buildmysoftware.patterns.adapter;

import pro.buildmysoftware.patterns.adapter.legacy.LegacyFileOperations;

import java.nio.file.Path;

public class FileOperationsAdapter implements FileOperations {

	private LegacyFileOperations fileOperations;

	public FileOperationsAdapter(LegacyFileOperations fileOperations) {
		this.fileOperations = fileOperations;
	}

	@Override
	public void createFile(Path path) {
		fileOperations.createMultipleFiles(false, path.toFile());
	}

	@Override
	public void deleteFile(Path path) {
		fileOperations.deleteFileByPath(path.toString());
	}
}
