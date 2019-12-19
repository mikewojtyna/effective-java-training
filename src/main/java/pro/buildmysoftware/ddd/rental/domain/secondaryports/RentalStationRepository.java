package pro.buildmysoftware.ddd.rental.domain.secondaryports;

import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.RentalStation;
import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.RentalStationId;

import java.util.Optional;

public interface RentalStationRepository {

	Optional<RentalStation> load(RentalStationId rentalSystem);

	void save(RentalStation station);
}
