package pro.buildmysoftware.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowableOfType;

public class FizzBuzzTest {

	// @formatter:off
	@DisplayName(
		"given any number, " +
		"then return msg according to the following examples"
	)
	@ParameterizedTest(name = "given {0}, expected: {1}")
	@CsvSource({
		" 1, '1' ",
		" 2, '2' ",
		" 3, 'fizz' ",
		" 5, 'buzz' ",
		" 6, 'fizz' ",
		" 10, 'buzz' ",
		" 15, 'fizzbuzz' ",
		" 30, 'fizzbuzz' ",
		" 432, 'fizz'"
	})
	// @formatter:on
	void test(int number, String expectedMsg) throws Exception {
		// when
		String msg = FizzBuzz.msg(number);

		// then
		assertThat(msg).isEqualTo(expectedMsg);
	}

	@DisplayName("given 0, then IllegalArgumentException is thrown")
	@Test
	void test() throws Exception {
		// given
		int number = 0;

		// when
		IllegalArgumentException ex =
			catchThrowableOfType(() -> FizzBuzz
			.msg(number), IllegalArgumentException.class);

		// then
		assertThat(ex).hasMessage("0 is not allowed");
	}
}
