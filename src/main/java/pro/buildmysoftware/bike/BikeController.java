package pro.buildmysoftware.bike;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.UUID;

@RestController
@RequestMapping("/api/bikes")
public class BikeController {

	private BikeRentalSystem bikeRentalSystem;

	@PostMapping
	public OperationResultDto rent(RentBikeCommand command,
				       Principal principal) {
		BikeRentResult bikeRentResult = bikeRentalSystem.rentBike(UUID
			.fromString(command.getBikeId()), new User(principal
			.getName()));
		return map(bikeRentResult);
	}

	private OperationResultDto map(BikeRentResult bikeRentResult) {
		return null;
	}
}
