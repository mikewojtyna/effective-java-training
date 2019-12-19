package pro.buildmysoftware.ddd.rental.domain.secondaryports;

import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.BikeRentResult;

public interface EventPublisher {

	void publishEvent(BikeRentResult rentResult);
}
