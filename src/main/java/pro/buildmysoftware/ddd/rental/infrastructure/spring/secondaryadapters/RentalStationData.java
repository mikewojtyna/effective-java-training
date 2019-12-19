package pro.buildmysoftware.ddd.rental.infrastructure.spring.secondaryadapters;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import pro.buildmysoftware.ddd.rental.domain.model.rentalstation.Bike;

@Document
@Data
public class RentalStationData {

	private Bike bike;
	private String id;
}
