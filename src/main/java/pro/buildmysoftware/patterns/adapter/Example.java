package pro.buildmysoftware.patterns.adapter;

import pro.buildmysoftware.patterns.adapter.legacy.VeryUglyLegacyFileOperations;

import java.io.IOException;

public class Example {

	public static void main(String[] args) throws IOException {
		FileOperations fileOperationsUsingUglyAdaptee =
			new FileOperationsAdapter(new VeryUglyLegacyFileOperations());
		Client client = new Client(fileOperationsUsingUglyAdaptee);
		client.runDemo();
	}
}
