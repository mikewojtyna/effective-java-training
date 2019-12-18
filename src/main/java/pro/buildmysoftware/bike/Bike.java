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

	/**
	 * Rents a bike. Even if this method has clear intention, it's a good
	 * idea to write javadoc to ensure the SRP discipline. If you have
	 * problems when writing javadoc for this method, then most probably
	 * it's not clean enough and violates SRP. The same applies to unit
	 * tests.
	 *
	 * @param user
	 * @return
	 */
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
