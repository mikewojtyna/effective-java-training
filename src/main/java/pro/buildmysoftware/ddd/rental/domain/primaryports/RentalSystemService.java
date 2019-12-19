package pro.buildmysoftware.ddd.rental.domain.primaryports;

import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.BikeRentResult;
import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.RentalStation;
import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.RentalStationId;
import pro.buildmysoftware.ddd.rental.domain.secondaryports.EventPublisher;
import pro.buildmysoftware.ddd.rental.domain.secondaryports.RentalStationRepository;

import java.util.Optional;

public class RentalSystemService {

	private RentalStationRepository repository;
	private EventPublisher publisher;

	public RentalSystemService(RentalStationRepository repository,
				   EventPublisher publisher) {
		this.repository = repository;
		this.publisher = publisher;
	}

	public void rentBike(RentalStationId rentalSystem) {
		Optional<RentalStation> rentalStation = repository
			.load(rentalSystem);
		rentalStation.ifPresent(station -> {
			BikeRentResult result = station.rentBike();
			repository.save(station);
			publisher.publishEvent(result);
		});
	}
}
