package pro.buildmysoftware.bike;

import lombok.Value;

@Value
public class RentBikeCommand {

	private String bikeId;

	public String getBikeId() {
		return bikeId;
	}
}
