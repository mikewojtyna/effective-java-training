package pro.buildmysoftware.bike;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Bike {

	@Id
	@GeneratedValue
	private UUID id;
	private boolean rent;

	public BikeRentResult rent() {
		// TODO: add some logic here and explore the rules
		return new BikeRentResult(true);
	}

	public BikeRentResult rentBy(User user) {
		if (user.hasSufficientFunds()) {
			performRentLogic();
			return new BikeRentResult(true, user);
		}
		return new BikeRentResult(false);
	}

	private void performRentLogic() {

	}
}
