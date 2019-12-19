package pro.buildmysoftware.ddd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.Bike;
import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.BikeRentResult;
import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.RentalStation;
import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.RentalStationId;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class BikeRentingTest {

	// @formatter:off
	@DisplayName(
		"given station with single bike, " +
		"when rent, then bike is rent"
	)
	// @formatter:on
	@Test
	void test1() throws Exception {
		// given
		Bike bike = anyBike();
		RentalStation rentalStation = rentalStationWithBike(bike);

		// when
		BikeRentResult result = rentalStation.rentBike();

		// then
		assertThat(extractBikeFromRentEvent(result)).isEqualTo(bike);
	}

	// @formatter:off
	@DisplayName(
		"given station with single bike, " +
		"when rent twice, then second rent fails (no available bike)"
	)
	// @formatter:on
	@Test
	void test3() throws Exception {
		// given
		Bike bike = anyBike();
		RentalStation rentalStation = rentalStationWithBike(bike);

		// when
		rentalStation.rentBike();
		BikeRentResult secondRentResult = rentalStation.rentBike();

		// then
		assertThat(secondRentResult.getBikeRentNotAvailable())
			.isPresent();
		assertThat(secondRentResult.getBikeRent()).isEmpty();
	}

	private Bike extractBikeFromRentEvent(BikeRentResult result) {
		return result.getBikeRent().get().getBike();
	}

	private Bike anyBike() {
		return new Bike();
	}

	private RentalStation rentalStationWithBike(Bike bike) {
		return new RentalStation(bike, anyId());
	}

	private RentalStation anyRentalStation() {
		return new RentalStation(anyBike(), anyId());
	}

	private RentalStationId anyId() {
		return new RentalStationId(UUID.randomUUID().toString());
	}
}
