package pro.buildmysoftware.ddd.rental.infrastructure.spring.secondaryadapters;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoSpringRentalRepository extends MongoRepository<RentalStationData, String> {

}
