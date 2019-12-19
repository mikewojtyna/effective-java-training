package pro.buildmysoftware.ddd.rental.domain.model.rentalstation;

public class RentalStation {

	private Bike bike;
	private RentalStationId id;

	public RentalStation(Bike bike, RentalStationId id) {
		this.bike = bike;
		this.id = id;
	}

	public Bike getBike() {
		return bike;
	}

	public RentalStationId getId() {
		return id;
	}

	public BikeRentResult rentBike() {
		if (bike == null) {
			return new BikeRentResult(new BikeRentNotAvailable());
		}
		BikeRentResult result = new BikeRentResult(new BikeRent(bike));
		bike = null;
		return result;
	}
}
