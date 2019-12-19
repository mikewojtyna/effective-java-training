package pro.buildmysoftware.ddd.rental.infrastructure.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import pro.buildmysoftware.ddd.rental.domain.primaryports.RentalSystemService;
import pro.buildmysoftware.ddd.rental.domain.secondaryports.EventPublisher;
import pro.buildmysoftware.ddd.rental.domain.secondaryports.RentalStationRepository;
import pro.buildmysoftware.ddd.rental.infrastructure.spring.secondaryadapters.MongoSpringRentalRepository;
import pro.buildmysoftware.ddd.rental.infrastructure.spring.secondaryadapters.SpringEventPublisher;
import pro.buildmysoftware.ddd.rental.infrastructure.spring.secondaryadapters.SpringRentalStationRepository;

@SpringBootApplication
public class RentalSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentalSpringApplication.class, args);
	}

	@Bean
	public EventPublisher springEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		return new SpringEventPublisher(applicationEventPublisher);
	}

	@Bean
	public RentalStationRepository repository(MongoSpringRentalRepository mongoRepository) {
		return new SpringRentalStationRepository(mongoRepository);
	}

	@Bean
	public RentalSystemService rentalSystemService(RentalStationRepository repository, EventPublisher eventPublisher) {
		return new RentalSystemService(repository, eventPublisher);
	}
}
