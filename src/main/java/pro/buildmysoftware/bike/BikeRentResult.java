package pro.buildmysoftware.bike;

import java.util.Optional;

public class BikeRentResult {

	private final boolean success;
	private final User user;

	public BikeRentResult(boolean success) {
		this.success = success;
		user = null;
	}

	public BikeRentResult(boolean success, User user) {
		this.success = success;
		this.user = user;
	}

	public boolean isSuccess() {
		return success;
	}

	public Optional<User> getUser() {
		return Optional.ofNullable(user);
	}
}
