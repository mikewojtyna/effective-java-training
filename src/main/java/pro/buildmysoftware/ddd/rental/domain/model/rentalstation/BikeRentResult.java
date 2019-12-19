package pro.buildmysoftware.ddd.rental.domain.model.rentalstation;

import java.util.Objects;
import java.util.Optional;

public class BikeRentResult {

	private BikeRent bikeRent;
	private BikeRentNotAvailable bikeRentNotAvailable;

	public BikeRentResult(BikeRent bikeRent) {
		this.bikeRent = bikeRent;
	}

	public BikeRentResult(BikeRentNotAvailable bikeRentNotAvailable) {
		this.bikeRentNotAvailable = bikeRentNotAvailable;
	}

	public Optional<BikeRent> getBikeRent() {
		return Optional.ofNullable(bikeRent);
	}

	public Optional<BikeRentNotAvailable> getBikeRentNotAvailable() {
		return Optional.ofNullable(bikeRentNotAvailable);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BikeRentResult that = (BikeRentResult) o;
		return Objects.equals(bikeRent, that.bikeRent) && Objects
			.equals(bikeRentNotAvailable,
				that.bikeRentNotAvailable);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bikeRent, bikeRentNotAvailable);
	}
}
