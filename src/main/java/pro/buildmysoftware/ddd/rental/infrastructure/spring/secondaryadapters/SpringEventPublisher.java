package pro.buildmysoftware.ddd.rental.infrastructure.spring.secondaryadapters;

import org.springframework.context.ApplicationEventPublisher;
import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.BikeRentResult;
import pro.buildmysoftware.ddd.rental.domain.secondaryports.EventPublisher;

public class SpringEventPublisher implements EventPublisher {

	private ApplicationEventPublisher applicationEventPublisher;

	public SpringEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	@Override
	public void publishEvent(BikeRentResult rentResult) {
		applicationEventPublisher.publishEvent(rentResult);
	}
}
