package pro.buildmysoftware.ddd.rental.infrastructure.spring.primaryadapters;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.RentalStationId;
import pro.buildmysoftware.ddd.rental.domain.primaryports.RentalSystemService;

@RestController
@RequestMapping("/api/stations")
public class RentalSystemRestController {

	private RentalSystemService rentalSystemService;

	public RentalSystemRestController(RentalSystemService rentalSystemService) {
		this.rentalSystemService = rentalSystemService;
	}

	@PostMapping("/{id}/bikes")
	public void rentBike(@PathVariable("id") String rentalStationId) {
		rentalSystemService
			.rentBike(new RentalStationId(rentalStationId));
	}
}
