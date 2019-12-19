package pro.buildmysoftware.ddd.rental.domain.model.rentalstation;

import java.util.Objects;

public class RentalStationId {

	private final String id;

	public RentalStationId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RentalStationId that = (RentalStationId) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
