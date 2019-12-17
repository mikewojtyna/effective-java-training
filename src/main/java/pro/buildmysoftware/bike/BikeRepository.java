package pro.buildmysoftware.bike;

import java.util.Optional;
import java.util.UUID;

public interface BikeRepository {

	Optional<Bike> findById(UUID bikeId);

	void save(Bike b);
}
