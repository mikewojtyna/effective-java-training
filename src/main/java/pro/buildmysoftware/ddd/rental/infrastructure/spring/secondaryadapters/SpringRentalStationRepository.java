package pro.buildmysoftware.ddd.rental.infrastructure.spring.secondaryadapters;

import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.RentalStation;
import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.RentalStationId;
import pro.buildmysoftware.ddd.rental.domain.secondaryports.RentalStationRepository;

import java.util.Optional;

public class SpringRentalStationRepository implements RentalStationRepository {

	private MongoSpringRentalRepository repository;

	public SpringRentalStationRepository(MongoSpringRentalRepository repository) {
		this.repository = repository;
	}

	@Override
	public Optional<RentalStation> load(RentalStationId rentalSystem) {
		return repository.findById(rentalSystem.getId())
			.map(document -> new RentalStation(document
				.getBike(), new RentalStationId(document
				.getId())));
	}

	@Override
	public void save(RentalStation station) {
		RentalStationData document = new RentalStationData();
		document.setId(station.getId().getId());
		document.setBike(station.getBike());
		repository.save(document);
	}
}
