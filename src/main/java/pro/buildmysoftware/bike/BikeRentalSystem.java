package pro.buildmysoftware.bike;

import java.util.UUID;

public class BikeRentalSystem {

	private BikeRepository bikeRepository;

	public BikeRentalSystem(BikeRepository bikeRepository) {
		this.bikeRepository = bikeRepository;
	}

	// @Transactional
	public BikeRentResult rentBike(UUID bikeId, User user) {
		return bikeRepository.findById(bikeId).map(b -> {
			BikeRentResult result = b.rentBy(user);
			bikeRepository.save(b);
			return result;
		}).orElse(new BikeRentResult(false));
	}
}
