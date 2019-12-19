package pro.buildmysoftware.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsExample {

	@DisplayName("show examples")
	@Test
	void test() throws Exception {
		// @formatter:off
		Stream.of("mike", "george", "john").flatMap(this::findByName)
			.parallel()
			.map(User::getAge)
			.reduce((acc, current) -> acc + current)
			.ifPresent(System.out::println);
		// @formatter:on
	}

	private Stream<User> findByName(String name) {
		User user0 = new User(name, new Random().nextInt(100));
		User user1 = new User(name, new Random().nextInt(100));
		User user2 = new User(name, new Random().nextInt(100));
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Stream.of(user0, user1, user2);
	}

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	private class User {

		private String name;
		private int age;
	}
}
